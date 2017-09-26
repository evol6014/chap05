package com.example.config;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.domain.DeptVO;

@Configuration
public class SitemeshConfig {

	@Bean
	FilterRegistrationBean<ConfigurableSiteMeshFilter> siteMeshFilter() {
		FilterRegistrationBean<ConfigurableSiteMeshFilter> filter =
				new FilterRegistrationBean<>();
		
		filter.setFilter(new ConfigurableSiteMeshFilter() {
			@Override
			protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
//				builder.addDecoratorPaths("/bootstrap/*", "/WEB-INF/decorators/default.jsp");
				builder.addDecoratorPaths("/bootstrap/*", "/WEB-INF/decorators/grid.jsp");
				builder.addDecoratorPaths("/animate/*", "/WEB-INF/decorators/default.jsp");
				builder.addDecoratorPaths("/chart/*", "/WEB-INF/decorators/grid.jsp");
				
			}
		});
		
		filter.setUrlPatterns(Arrays.asList("/bootstrap/*", "/animate/*", "/chart/*"));		
		
		return filter;
	}
	
	@Bean
	FilterRegistrationBean<Filter> testFilter() {
		FilterRegistrationBean<Filter> filter = new FilterRegistrationBean<>();

		filter.setFilter(new Filter() {
			
			@Override
			public void init(FilterConfig filterConfig) throws ServletException {
				System.out.println("###################");
				System.out.println("## My Filter init()");
				System.out.println("###################");
			}
			
			@Override
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
					throws IOException, ServletException {
				System.out.println("###");
				System.out.println("### My Filter doFilter() start...");
				System.out.println("###");
				chain.doFilter(request, response);
				System.out.println("###");
				System.out.println("### My Filter doFilter() end...");
				System.out.println("###");
			}
			
			@Override
			public void destroy() {
				System.out.println("######################");
				System.out.println("## My Filter destory()");
				System.out.println("######################");
			}
		});
		filter.setUrlPatterns(Arrays.asList("/dept/*", "/emp/*"));	// url 매핑 / 지정한 주소에 있는거 호출할때는 이 필터를 거친다.
		
		return filter;
	}
	
}

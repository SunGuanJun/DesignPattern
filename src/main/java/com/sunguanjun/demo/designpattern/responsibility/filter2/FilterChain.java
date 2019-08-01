package com.sunguanjun.demo.designpattern.responsibility.filter2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	public FilterChain addFilter(Filter filter){
		filters.add(filter);
		return this;
	}
	
	public void doFilter(Request request, Response response){
		if (index == filters.size())
			return ;
		
		Filter f = filters.get(index);
		index++;
		f.doFilter(request, response, this);
		
	}
}

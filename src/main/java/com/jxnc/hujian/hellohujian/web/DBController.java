//package com.jxnc.hujian.hellohujian.web;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/db")
//public class DBController {
//
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	@RequestMapping("/query")
//	public List<Map<String, Object>> queryAll(){
//		
//		String sql = "select * from t_test";
//		
//		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//		
//		for(Map<String, Object> map: list){
//			
//			Set<Entry<String, Object>> sets = map.entrySet();
//			for(Entry<String, Object> values :sets){
//				if(values == null){
//					continue;
//				}
//				
//				System.out.println(values.getKey() +" : " +values.getValue());
//				
//				
//			}
//		}
//		
//		
//		
//		return null;
//		
//	}
//	
//	
//}

package com.Userservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Userservice.VO.Department;
import com.Userservice.VO.ResponseTemplateVO;
import com.Userservice.entity.User;
import com.Userservice.repository.UserRepository;

@Service
public class userserviceimpl  {
  
	@Autowired
	private UserRepository userrepository;

	@Autowired
	private RestTemplate resttemplate;
	

	
	public User saveuser(User user) 
	{
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	public ResponseTemplateVO getuserwithdepartment(Long userid) 
	{
		
		ResponseTemplateVO vo= new ResponseTemplateVO();
		User user= userrepository.findById(userid).get();
		
		Department department=resttemplate.getForObject("https://localhost:9090/Departments/"+user.getDepartmentid(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
		
	}
	
}

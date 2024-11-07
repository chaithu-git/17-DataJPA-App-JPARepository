package in.chaithanya;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import in.chaithanya.entity.User;
import in.chaithanya.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		 UserRepository repository=context.getBean(UserRepository.class);
		 
		
			 // User user=new User();
			// user.setUserId(17); 
//			 user.setUserName("Shivani");
//			 user.setUsergender("female"); 
//			 user.setUserAge(24);
//			 user.setUserCountry("jarmany");
//			 
//			 repository.save(user);
			 
				 
			  //List<User> users=repository.findAll();
			// List<User> users=repository.findAll(Sort.by("userAge"));
			// List<User> users=repository.findAll(Sort.by("userAge","userName").descending());
//			 int pageSize=3;
//			 int pageNo=1;
//			PageRequest pageRequest=PageRequest.of(pageNo-1, pageSize);
//			Page<User> pageData=repository.findAll(pageRequest);
//			
//			 int totalPages=pageData.getTotalPages();
//			 System.out.println(totalPages);
//			 
//			List<User> users=pageData.getContent();
//			users.forEach(user->{
//				System.out.println(user);
//	});
			
		 User entity=new User();
		 entity.setUserCountry("UK");//if it is required
		 entity.setUsergender("male");//if it is required
		 Example<User> example=Example.of(entity);
		List<User> users= repository.findAll(example);
		
		users.forEach(user->{
			System.out.println(users);
		});
		
		//repository.findAll(example,sort); // findAll is overloaded method
		//repository.findAll(example,Pageable);
	}
 
}

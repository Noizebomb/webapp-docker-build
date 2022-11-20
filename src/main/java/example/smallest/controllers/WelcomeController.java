package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "From the start of class we have learned how how to create a bastion host/jumpbox allowing ssh access to a private network. We then moved on to setting up a private instance with a NAT gateway allowing outbound traffic for application updates, pulling/pushing versions to git/docker, etc. We created a springboot application which was packaged using maven and ran it off tomcat which uses port 8080. From there a load balancer was setup and pointed at the private instance allowing the public/consumers to view our application. We took it a step further and decided to containerize the application using docker. By containerizing our application we could run multiple apps with a reduction in used resources. We then learned how to push and pull our containers to our docker hubs on the command line as well as version out our apps through tags. This has been a very helpful and informative class for me. I feel like I will be ready to hit the job market when we are finished. Thanks Asim! GREAT WE LEARD TERRAFORM BASICS"; //"application/json" mean this is a text not a redirect
	}
}

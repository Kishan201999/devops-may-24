pipeline{
	Stages{
		stage ("Building Image"){
			script{
		aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-password 111111111111.dkr.ecr.ap-south-1.amazonaws.com
                docker tag --
                docker push --	
			}	
				}
		stage ("Pushing to ECS"){	
			Script {
  
			}	
		
		}
	
	
	
	}
	

}

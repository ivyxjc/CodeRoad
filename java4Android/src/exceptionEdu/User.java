package exceptionEdu;

class User {
	private int age;
	
	public void setAge(int age) throws Exception{
		if(age<0){
			Exception e=new Exception("���䲻��Ϊ����");
			throw e;
		}
		this.age=age;
	}

}

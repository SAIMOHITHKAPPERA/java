package com.placement.oops;
public class Instagram{
	  String userName;
	  int followers;
	  int postCount;
	  public void shareReel(){
	    System.out.println("Reels shared");
	  }
	  public void addStory(){
	    System.out.println("story added");
	  }
	  public static void main(String []args){
	    Instagram ac1=new Instagram();
	    Instagram ac2=new Instagram();
	    ac1.userName="mohith";
	    ac1.followers=91;
	    ac1.postCount=10;
	    ac2.userName="koppera";
	    ac2.followers=10;
	    ac2.postCount=12;
	  }
	  
	}

/*public class Instagram{
String userName;
int followers;
int postCount;
public Instagram(String name,int i,int j){
  userName=name;
  followers=i;
  postCount=j;
}
public Instagram(){
  userName="hello";
  followers=0;
  postCount=1;
}
public void shareReel(){
  System.out.println("Reels shared");
}
public void addStory(){
  System.out.println("story added");
}
public static void main(String []args){
  Instagram ac1=new Instagram("mohith",97,12);
  Instagram ac2=new Instagram();
  
}

}*/
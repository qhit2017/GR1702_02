package s;

public class SingdeInstacelazy {
private SingdeInstacelazy(){
	
}
          private static SingdeInstacelazy singdeInstacelazy=null;
          private static SingdeInstacelazy getSingdeInstacelazy(){
        	  if(singdeInstacelazy==null){
        		  singdeInstacelazy=new SingdeInstacelazy();
        		 
        	  }
			return singdeInstacelazy;
          }
}

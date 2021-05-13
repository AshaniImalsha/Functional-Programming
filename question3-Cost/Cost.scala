object Cost extends App{
    
      def getTotalCost(x:Int):Double={
              if(x>50){
                      var cost:Double=(3*50)+(0.75*(x-50))+(24.95*x*(60.00/100.00));
                      cost;
              }else{
                      var cost:Double=(3*x)+(24.95*x*(60.0/100.0));
                      cost;
              }
  
      }
      println(getTotalCost(60));
}


package Java_Interview_Topics.MultiThreading.Producer_Consumer_Problem;

public class MainClass {

    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(3);

        //Produce Thread
        Thread producerThread=new Thread(()->{

            try {
                for(int i=1;i<=10;i++)
                {
                    sharedResource.produce(i);
                }
            }
            catch (InterruptedException ex)
            {
                /// exception handled
            }
        });

        Thread consumerThread=new Thread(()->{
           try{
               for(int i=1;i<=10;i++)
               {
                   sharedResource.consumeItem();
               }
           }
           catch (InterruptedException ex)
           {
               //handle exception
           }
        });


        producerThread.start();
        consumerThread.start();
    }
}

/*      ================================= EXAMPLE1 ============================== */
class A extends Thread{
  public void run(){
    for(int i =0;i<=10;i++){
        System.out.println("Sam");
    }
  }
}

class B extends Thread{
  public void run(){
    for(int i =0;i<=10;i++){
        System.out.println("Nikki");
    }
  }
}

/*                                   EXAMPLE 2                          */

// public synchronized  void printHi() {} method role :-
// Role: It is a synchronized method that controls thread execution using wait() and notify().
// Purpose: Ensures that threads execute in alternating order (Thread A → Thread B).
// Execution: Only one thread can execute it at a time (due to synchronized).

class SharedResource{
  private boolean turnA = true; // Track whose turn it is

     
      public synchronized  void printHi(){
        while(!turnA)// If it's not A's turn, wait, turnA = false in this condition it goes to wait state
          {
            try{
              wait(); // thread enter at waiting state
            }
            catch(InterruptedException e){
              e.printStackTrace();
            }
          }
        System.out.println("Hi");
        turnA = false; //switch to B's turn
        notify(); // Notify Thread C (A's turn)
      }
    

   
      public synchronized  void PrintHello(){
        while(turnA){
          try{
            wait();
          }
          catch(InterruptedException e){
            e.printStackTrace();
          }
        }

        System.out.println("Hello");
        turnA = true;
        notify(); // Notify Thread D (B's turn)
      }
    


}

class C extends Thread{
  private SharedResource resource ; // making SharedResource reference

  public C (SharedResource resource){ //in this constructor accepting the object of SharedResource

    this.resource = resource;
  }
  public void run(){
    for(int i=1;i<=5;i++){
      resource.PrintHello();
    }
  }
}

class D extends Thread {
  private SharedResource resource;

  public D(SharedResource resource) {
      this.resource = resource;
  }

  public void run() {
      for (int i = 0; i < 5; i++) {
          resource.printHi();
      }
  }
}


public class ThreadDemo {
  public static void main(String[] args) {
      A obj1 = new A(); 
      B obj2 = new B();

      // obj1.run(); //it works, but it does not create a new thread. Instead, it executes the run() method like a normal function call inside the main thread.
      
      /* 
      * start() :- Creates a new thread and calls run() in that new thread. 
      */

      System.out.println("MultiTHreading happens ");
      //A and B execute concurrently in separate threads, so the output is mixed.
      obj1.start();
      obj2.start();

    //using example 2

    SharedResource resource = new SharedResource(); //creating an instance of SharedResource

    C t1 = new C(resource); // Create Thread C object
    D t2 = new D(resource);

    t1.start(); // Thread C moves to RUNNABLE
    t2.start(); // Thread D moves to RUNNABLE



      /* ========================== THREAD LIFE CYCLE ===================================================== */

      // +---------------------------+
      // |       NEW (Created)       |
      // |  Thread obj = new Thread()|
      // +---------------------------+
      //             |
      //             | obj.start();
      //             V
      // +---------------------------+
      // |      RUNNABLE (Ready)     | <-------+
      // | Waiting for CPU time      |         |
      // +---------------------------+         | CPU Scheduler
      //             |                           selects the thread
      //             | CPU Assigns Execution    |
      //             V                          |
      // +---------------------------+          |
      // |       RUNNING (Active)    | ---------+
      // | Executes run() method     |
      // +---------------------------+
      //         |         |
      //         |         | Thread calls wait()
      //         |         V
      //         |   +------------------+
      //         |   |    WAITING       |  <---+
      //         |   | Thread is paused |       | Thread gets notified
      //         |   +------------------+       | ( notify() is called)
      //         |            |                 |
      //         |            |                 |
      //         |    notify() is called        |
      //         |            |                 |
      //         |            V                 |
      //         |   +------------------+       |
      //         |   |   RUNNABLE       | ------+
      //         |   | Waiting for CPU  |
      //         |   +------------------+
      //         |            
      //         | CPU assigns execution again
      //         |            
      //         V            
      // +---------------------------+
      // |    TERMINATED (Dead)      |
      // | Execution is completed    |
      // +---------------------------+

  }
}

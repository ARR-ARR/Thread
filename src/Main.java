public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadNew threadNew = new ThreadNew();

        threadNew.start();
        t1.start();


 /*Второй поток t2 начнет выполнение только после того, как будет завершен
       (или бросит исключение) первый поток - t1*/
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        //Главный поток продолжит работу только после того, как t1 и t2 завершат работу
        try {
            t1.join();
            t2.join();
            System.out.println("Major thread waits");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        

        System.out.println("Все потоки закончили работу, программа завершена");

    }
}

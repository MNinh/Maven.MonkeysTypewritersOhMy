package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier{


    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public synchronized void run() {
        while(stringIterator.hasNext()){
            this.copied += stringIterator.next() + " ";
//            try {
//                Thread.sleep(600);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

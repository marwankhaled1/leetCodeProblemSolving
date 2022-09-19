public class Arrayclone {
    public int length;
    public int capacity;
    public int[] container;

    // create array we have to constructors with size or with no size
    public Arrayclone(int size) {
        container = new int[size];
        length = 0;
        capacity = size;

    }

    public void append(int value) {
        // array full of element so, we need expansion
        // index here depends on array zero index rule
        //array is empty
        if (length<capacity)
        {

            container[length]=value;
            length++ ;
        }
        else
        {
            int [] newContainer=new int[capacity+1];
       // loop till the end of the smallest array to avoid array out bounds
            for(int i=0;i<container.length;i++)
            {
                newContainer[i]=container[i];

            }
            // index here for the last element in the new array if we want to be capacity then we should swap the next two lines

            newContainer[newContainer.length-1]=value;
            capacity=newContainer.length;
            length++;
            container=newContainer;
        }


    }
    // delete if we have tool to delete the last element then shift left elements from index tell the <=length/capacity-2
    //if we should have new array to put element in it
    // all solutions will be o(n)


    public void delete(int index) {
        int[] newcontainer = new int[capacity - 1];

        // note we now have the newcontainer is the smallest one so, we loop till the <=container.length-2
        //or till <= newcontainer.length-1
        //or till (<)container.length-1

        for (int i = 0; i < container.length - 1; i++) {
        if(index>length||index<0)
        {
            System.out.println("out of Boundaries");
            return;
        }


            if (i == index) {
                newcontainer[i] = container[i + 1];
            } else if (i < index) {
                newcontainer[i] = container[i];
            } else {
                newcontainer[i] = container[i + 1];
            }
        }
        container=newcontainer;
        length--;
        capacity--;

    }

    public void print() {

        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);

        }

    }


}

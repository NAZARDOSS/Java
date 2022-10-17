import java.util.Arrays;

public class Tasks {
        public static void main(String[] args) {
            int array[] = {25,14,56,15,47};
            insertNum(array,5,2);

            //max; min
            int min = array[0];
            int max = array[4];
            for (int i = 0; i < array.length; i++) {
                if (min > array[1])
                    min = array[1];

                if (min > array[2])
                    min = array[2];

                if (min > array[3])
                    min = array[3];

                if (max < array[1])
                    max = array[1];

                if (max < array[2])
                    max = array[2];

                if (max < array[3])
                    max = array[3];
            }
            System.out.println("Min:" + min);
            System.out.println("Max:" + max);
            //sum
            int num1 = 3;
            int num2 = 5;
            int num3 = 105;
            int sum = num1 + num2 + num3;
            System.out.println("Sum:"+sum);


        }
        private static void insertNum(int array[], int num, int index){
            int newArray[]=new int [array.length+1];
            newArray[index]=num; //помещаем нужный нам елем в массив

            for (int i=0;i<index;i++){
                newArray[i]=array[i];
            }
            for (int i= index; i< array.length;i++){
                newArray[i+1]=array[i];
            }
            array=newArray;
            System.out.println(Arrays.toString(array));

        }

    }





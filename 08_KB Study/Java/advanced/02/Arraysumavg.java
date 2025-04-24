public class Arraysumavg {
    public static void main(String[] args) {
        int [][] array ={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
                };
                int sum=0;

        for( int i = 1; i <= array.length; i++ ) {
            for( int j = 1; j <=array[i].length; j++)
                sum += array[i][j];

        }
    }
}

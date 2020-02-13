public class shuzu {
    public static boolean Find(int target, int [][] array) {
        int row =array.length;
        if(row == 0){
            return false;
        }
        int col = array[0].length;
        if(col == 0){
            return false;
        }
        for(int i =0 ;i<row;i++){
            for(int j = 0;j<col ;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] [] array ={{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;
        boolean arr = Find(target,array);
        if(arr == true){
            System.out.println("true");
        }
        else{System.out.println("false");}
        int targets = 8;
        boolean arrs = Find(targets,array);
        if(arrs == true){
            System.out.println("true");
        }
        else{System.out.println("false");}

    }
}



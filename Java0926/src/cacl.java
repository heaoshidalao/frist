public class cacl {
    private double num1;
    private double num2;
    public  double Add(double num1,double num2){
        return num1+num2;
    }
    public double  Sub(double num1,double num2){
        return num1-num2;
    }
    public double  Mul(double num1,double num2){
        return num1*num2;
    }
    public double Div(double num1,double num2){
        if(num2==0){
            System.out.println("除数不能为0");
          //  return 0;
        }
        return num1/num2;
    }
}

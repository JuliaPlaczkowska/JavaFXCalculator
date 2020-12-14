package edu.ib;


public class Calculator {
    private double[] temp = new double[2];
    private String actualText;
    private String operator;

    public Calculator() {
        actualText = "";
        temp[0] = 0;
        temp[1] = 0;
    }

    public String modifyNumber2(String val){
        if(actualText.charAt(actualText.length()) == '.' || !String.valueOf(temp[1]).equals(actualText)){
            //if(actualText.charAt(0) == '0')



        }
        if(temp[1] == 0 && val.equals(".")){
            actualText = ".";}
        else if(temp[1]==0){
            actualText = val;
            temp[1] = Double.parseDouble(actualText);
        }
        else{
            actualText = actualText + val;
            temp[1] = Double.parseDouble(actualText);
        }
        return actualText;
    }

    public String modifyNumber(String val){


        if(!actualText.endsWith(".")){
            if(!actualText.isEmpty())
                if(actualText.equals("0"))
                    actualText=val;
                else
                if(Double.parseDouble(actualText) == temp[1])
                    actualText = actualText + val;
                else
                    actualText = val;
            else
                actualText = val;
        }
        else if(Double.parseDouble(actualText.replace(".", ".0 ")) == (temp[1]) ){
            actualText = actualText + val;
            temp[1] = Double.parseDouble(actualText);
        }
        else{
            actualText = val;
            if(val.equals(".")) {
                temp[1] = 0;
            }
        }

        if(!val.equals("."))
            temp[1] = Double.parseDouble(actualText);
        return actualText;
    }

    public String delete(){
        actualText = "";
        temp[0] = 0;
        temp[1] = 0;
        return actualText;
    }

    public void setOperator(String operator) {
        if(actualText.isEmpty())
            temp[0]=0;
        else
            temp[0] = Double.parseDouble(actualText);
        actualText="";
        temp[1] = 0;
        this.operator = operator;
    }

    public void setActualText(String actualText) {
        this.actualText = actualText;
        if(actualText.isEmpty())
            temp[1]=0;
        else
            temp[1] = Double.parseDouble(actualText);
    }

    public String getActualText() {
        return actualText;
    }

    public String calculate(){
        double result = 0;
        if(operator.isEmpty())
            result = temp[1];
        else{
            switch(operator){
                case"plus" : result = temp[0]+temp[1]; break;
                case"minus" : result = temp[0]-temp[1]; break;
                case"multiply" : result = temp[0]*temp[1]; break;
                case"divide" : result = temp[0]/temp[1]; break;
            }
            temp[0]=result;
            actualText = String.valueOf(result);}
        return  String.valueOf(result);
    }

    public String percent(){
        if(actualText.isEmpty())
            actualText ="0";
        else
            actualText = String.valueOf(Double.parseDouble(actualText)*100);
        temp[1]=Double.parseDouble(actualText);
        return actualText;
    }

    public String changeSign(){
        actualText = String.valueOf(Double.parseDouble(actualText)*(-1));
        if(actualText.isEmpty())
            temp[1]=0;
        else
            temp[1] = Double.parseDouble(actualText);
        return actualText;
    }

}

public class dmgcalcusmain {
    private double totala;
    private double multiple;
    private double c;
    private double d;
    private double e;
    private double f;
    private double total;
    String yes;
    String no;
    private double newresult1;
    private double newresult2;
    private double g;

    /*construtor*/

    public void settotala(double 攻击力) {
       totala = 攻击力;
    }

    public double gettotala(){
        return totala;
    }

   public void setmultiple(double 技能倍率, double 额外乘区){
        multiple = 技能倍率 *(1+ 额外乘区);
   }

   public double getmultiple(){
        return multiple;
   }

   public void setc(double 伤害加成){
        c = 1+ 伤害加成;
   }

   public double getc(){
        return c;
   }

  public void setd(double 暴击率,double 暴击系数){
        d = 1*(暴击率 * 暴击系数);
  }

  public double getd(){
        return d;
  }

  public void sete(double 暴击系数){
        e= 1+暴击系数;
  }

  public double gete(){
        return e;
  }

  public void setf(double 角色等级, double 怪物等级, double 防御减免){
        f = (角色等级 + 100)/((1-防御减免)*(怪物等级 +100)+角色等级+100);
  }

  public double getf(){
        return f;
  }

  public double counttotal(){
        total = totala * multiple * c * e * f * 0.9;
        return total;
  }

  public void setNewresult1(double 精通, double 反应系数提高){
     newresult1 = (1+ 精通 + 反应系数提高);
  }

  public double getNewresult1(){
        return newresult1;
  }

  public void setNewresult2(double 精通, double 反应系数提高){
        newresult2 =  ( 1+ 精通 + 反应系数提高);
  }

    public double getNewresult2(){
        return newresult1;
    }


    public double getg(){
        return g;
    }






}



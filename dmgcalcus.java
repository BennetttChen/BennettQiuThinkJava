import java.util.Scanner;
public class dmgcalcus {
    public static void main(String[] args) {
        dmgcalcusmain people;
        people = new dmgcalcusmain();
        Scanner scnr = new Scanner(System.in);

        System.out.println("计算器仅计算浮点数值，请勿输入百分数");

        System.out.println("输入攻击力:");
        double 攻击力 = scnr.nextDouble();
        people.settotala(攻击力);
        System.out.println("总攻击力为： " + people.gettotala());

        System.out.print("输入技能倍率，此为技能基础倍率:");
        double 技能倍率 = scnr.nextDouble();
        System.out.print("输入额外乘区，例如人物天赋效果:");
        double 额外乘区 = scnr.nextDouble();
        people.setmultiple(技能倍率, 额外乘区);
        System.out.println("伤害倍率为： " + people.getmultiple());

        System.out.print("输入伤害加成，如武器或圣遗物套装效果:");
        double 伤害加成 = scnr.nextDouble();
        people.setc(伤害加成);
        System.out.println("伤害加成系数为： " + people.getc());

        System.out.print("输入暴击率:");
        double 暴击率 = scnr.nextDouble();
        System.out.print("输入暴击伤害:");
        double 暴击系数 = scnr.nextDouble();
        people.setd(暴击率, 暴击系数);
        System.out.println("暴击期望为: " + people.getd() + "  (此数值越接近2越理想.)");
        people.sete(暴击系数);
        System.out.println("暴击系数为: " + people.gete());

        System.out.print("输入角色等级:");
        double 角色等级 = scnr.nextInt();
        System.out.print("输入怪物等级:");
        double 怪物等级 = scnr.nextInt();
        System.out.print("输入防御减免，如雷神2命无视防御天赋:");
        double 防御减免 = scnr.nextDouble();
        people.setf(角色等级, 怪物等级, 防御减免);
        System.out.println("防御区为: " + people.getf());
        System.out.println("抗性默认10%故不计入计算");


        System.out.println("预估总伤害为: " + people.counttotal());




        /*计算case1*/

        System.out.println("是否计算单次元素反应伤害？选择yes or no");
        String answer = scnr.next();
        if (answer.equals("yes")) {
            System.out.println("输入反应类型,蒸发选择1，融化选择2");
            int type = scnr.nextInt();
            if (type == 2) {
                System.out.println("冰火融化选择1，火冰融化选择2");
                int type2 = scnr.nextInt();
                if (type2 == 1) {
                    System.out.println("冰火融化伤害为: " + people.counttotal() * 1.5);
                    System.out.println("是否计算增幅反应伤害？选择yes or no");
                    String answer2 = scnr.next();
                    if (answer2.equals("yes")) {
                        System.out.println("输入元素精通，具体可参考面板:");
                        double 精通 = scnr.nextDouble();

                        System.out.println("输入反应系数，如圣遗物套装效果中有描述，可参考魔女四件套效果：");
                        double 反应系数提高 = scnr.nextDouble();
                        people.setNewresult1(精通, 反应系数提高);
                        System.out.println("反应倍率为: " + 1.5*people.getNewresult1());
                        System.out.println("反应后总伤害为：" + 1.5*people.getNewresult1() * people.counttotal());
                    } else {
                        System.out.println("程序退出");
                    }


                    /*case2*/

                } else if (type2 == 2) {
                    System.out.println("火冰融化伤害为: " + people.counttotal() * 2);
                    System.out.println("是否计算增幅反应伤害？选择yes or no");
                    String answer3 = scnr.next();
                    if (answer3.equals("yes")) {
                        System.out.println("输入元素精通，具体可参考面板:");
                        double 精通 = scnr.nextDouble();

                        System.out.println("输入反应系数，如圣遗物套装效果中有描述，可参考魔女四件套效果：");
                        double 反应系数提高 = scnr.nextDouble();
                        people.setNewresult1(精通, 反应系数提高);
                        System.out.println("反应倍率为: " + 2*people.getNewresult2());
                        System.out.println("反应后总伤害为：" + 2*people.getNewresult2() * people.counttotal());
                    } else {
                        System.out.println("程序退出");
                    }
                } else {
                    System.out.println("输入数字错误，程序退出");
                }
            }

            /*case3*/

            if (type == 1) {
                System.out.println("火水蒸发选择1，水火蒸发选择2");
                int answer7 = scnr.nextInt();
                if (answer7 == 1) {
                    System.out.println("火水蒸发伤害为: " + people.counttotal() * 1.5);
                    System.out.println("是否计算增幅反应伤害？选择yes or no");
                    String answer5 = scnr.next();
                    if (answer5.equals("yes")) {
                        System.out.println("输入元素精通，具体可参考面板:");
                        double 精通 = scnr.nextDouble();

                        System.out.println("输入反应系数，如圣遗物套装效果中有描述，可参考魔女四件套效果：");
                        double 反应系数提高 = scnr.nextDouble();
                        people.setNewresult1(精通, 反应系数提高);
                        System.out.println("反应倍率为: " + 1.5*people.getNewresult1());
                        System.out.println("反应后总伤害为：" + 1.5*people.getNewresult1() * people.counttotal());
                    } else {
                        System.out.println("程序退出");
                    }


                    /*case4*/


                } else if (answer7 == 2) {
                    System.out.println("水火蒸发伤害为: " + people.counttotal() * 2);
                    System.out.println("是否计算增幅反应伤害？选择yes or no");
                    String answer6 = scnr.next();
                    if (answer6.equals("yes")) {
                        System.out.println("输入元素精通，具体可参考面板:");
                        double 精通 = scnr.nextDouble();

                        System.out.println("输入反应系数，如圣遗物套装效果中有描述，可参考魔女四件套效果：");
                        double 反应系数提高 = scnr.nextDouble();
                        people.setNewresult1(精通, 反应系数提高);
                        System.out.println("反应倍率为: " + 2*people.getNewresult2());
                        System.out.println("反应后总伤害为：" + 2*people.getNewresult2() * people.counttotal());
                    } else {
                        System.out.println("程序退出");
                    }
                } else {
                    System.out.println("输入数字错误，程序退出");
                }

            } else {
                System.out.println("程序退出");
            }

            /*优化中。。。*/

        }
        final double ele_ment = 3;
        for (int i = 0; i < ele_ment; i++) {
            System.out.println("Thanks for using;)");
        }
    }
    }





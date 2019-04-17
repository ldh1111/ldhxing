import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NewTest {

    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][]
                {       { "儿童", "头等舱","中国","中国",39, 50, 50, 57, 500,0.0},
                        { "儿童", "公务舱","中国","中国",29, 50, 50, 57, 500,0.0},
                        { "儿童", "明珠经济舱","中国","中国",19, 50, 50, 57, 500,0.0},
                        { "占座婴儿", "明珠经济舱","中国","中国",9, 50, 50, 57, 500,0.0},
                        { "南航明珠金卡会员", "头等舱","中国","中国",59, 50, 50, 57, 500,0.0},
                        { "南航明珠银卡会员", "头等舱","中国","中国",49, 50, 50, 57, 500,0.0},
                        { "留学生", "头等舱","中国","中国",39, 50, 50, 57, 500,0.0},
                        { "儿童", "头等舱","中国","中国",41, 50, 50, 57, 500,7.5},
                        { "儿童", "公务舱","中国","中国",31, 50, 50, 57, 500,7.5},
                        { "儿童", "明珠经济舱","中国","中国",21, 50, 50, 57, 500,7.5},
                        { "占座婴儿", "明珠经济舱","中国","中国",11, 50, 50, 57, 500,7.5},
                        { "不占座婴儿", "明珠经济舱","中国","中国",11, 50, 50, 57, 500,7.5},
                        { "儿童", "明珠经济舱","中国","中国",19, 50, 50, 57, 500,0.0},
                        { "占座婴儿", "明珠经济舱","中国","中国",9, 50, 50, 57, 500,0.0},
                        { "南航明珠金卡会员", "头等舱","中国","中国",59, 50, 50, 57, 500,0.0},
                        { "南航明珠银卡会员", "头等舱","中国","中国",49, 50, 50, 57, 500,0.0},
                        { "留学生", "头等舱","中国","中国",39, 50, 50, 57, 500,0.0},
                        { "儿童", "头等舱","中国","中国",41, 50, 50, 57, 500,7.5},
                        { "儿童", "公务舱","中国","中国",31, 50, 50, 57, 500,7.5},
                        { "儿童", "明珠经济舱","中国","中国",21, 50, 50, 57, 500,7.5},
                        { "儿童", "头等舱","中国","中国",41, 50, 50, 57, 500,7.5},
                        { "儿童", "公务舱","中国","中国",31, 50, 50, 57, 500,7.5},
                        { "儿童", "明珠经济舱","中国","中国",21, 50, 50, 57, 500,7.5},
                        { "占座婴儿", "明珠经济舱","中国","中国",11, 50, 50, 57, 500,7.5},
                        { "不占座婴儿", "明珠经济舱","中国","中国",11, 50, 50, 57, 500,7.5},
                        { "儿童", "明珠经济舱","中国","中国",19, 50, 50, 57, 500,0.0},
                        { "占座婴儿", "明珠经济舱","中国","中国",9, 50, 50, 57, 500,0.0},
                        { "南航明珠金卡会员", "头等舱","中国","中国",59, 50, 50, 57, 500,0.0},
                        { "南航明珠金卡会员", "明珠经济舱","中西亚","中国",42, 50, 50, 57, 500,0.0},
                        { "成人", "明珠经济舱","中西亚","中国",33, 50, 50, 57, 500,3000.0},

                };
    }
    @DataProvider(name = "test2")
    public static Object[][] primeNumbers2() {
        return new Object[][]
                {
                        { "成人", "头等舱","美洲","中国",31, 50, 50, 57 ,31, 50, 50, 57 ,31, 50, 50, 57, 500,0.0},
                        { "南航明珠金卡会员", "头等舱","美洲","中国",51, 50, 50, 57 ,51, 50, 50, 57 ,51, 50, 50, 57, 500,0.0},
                        { "南航明珠银卡会员", "头等舱","美洲","中国",41, 50, 50, 57 ,41, 50, 50, 57 ,41, 50, 50, 57, 500,0.0},
                        { "成人", "头等舱","中西亚","中国",46, 50, 50, 57 ,46, 50, 50, 57 ,46, 50, 50, 57, 500,-1.0},
                        { "南航明珠金卡会员", "头等舱","内罗毕","中国",66, -2, 50, 57 ,66, 50, 50, 57 ,66, 50, 50, 57, 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",22, 44, 50, 57 ,22, 50, 50, 57 ,22, 50, 50, 57, 500,1000.0},
                        { "南航明珠金卡会员", "头等舱","韩国","中国",66, -2, 50, 57 ,66, 50, 50, 57 ,66, 50, 50, 57, 500,-1.0},
                        { "南航明珠银卡会员", "头等舱","美洲","中国",41, 50, 50, 57 ,41, 50, 50, 57 ,41, 50, 50, 57, 500,0.0},
                        { "成人", "头等舱","中西亚","中国",46, 50, 50, 57 ,46, 50, 50, 57 ,46, 50, 50, 57, 500,-1.0},
                        { "南航明珠金卡会员", "头等舱","内罗毕","中国",66, -2, 50, 57 ,66, 50, 50, 57 ,66, 50, 50, 57, 500,-1.0},
                        { "成人", "头等舱","中西亚","中国",46, 50, 50, 57 ,46, 50, 50, 57 ,46, 50, 50, 57, 500,-1.0},
                        { "南航明珠金卡会员", "头等舱","内罗毕","中国",66, -2, 50, 57 ,66, 50, 50, 57 ,66, 50, 50, 57, 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",22, 44, 50, 57 ,22, 50, 50, 57 ,22, 50, 50, 57, 500,1000.0},
                        { "南航明珠金卡会员", "头等舱","韩国","中国",66, -2, 50, 57 ,66, 50, 50, 57 ,66, 50, 50, 57, 500,-1.0},
                        { "南航明珠银卡会员", "头等舱","美洲","中国",41, 50, 50, 57 ,41, 50, 50, 57 ,41, 50, 50, 57, 500,0.0},



                };
    }
    @DataProvider(name = "test3")
    public static Object[][] primeNumbers3() {
        return new Object[][]
                {       { "成人", "头等舱","美洲","中国",22, 50, 50, 57 ,22, 50, 50, 57 , 500,0.0},
                        { "南航明珠金卡会员", "明珠经济舱","美洲","中国",42, 50, 50, 57 ,42, 50, 50, 57 , 500,0.0},
                        { "南航明珠银卡会员", "明珠经济舱","美洲","中国",32, 50, 50, 57 ,32, 50, 50, 57 , 500,0.0},
                        { "成人", "明珠经济舱","中西亚","中国",-1, 50, 50, 57 ,33, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",53, -2, 50, 57 ,53, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","韩国","中国",22, 44, 50, 57 ,22, 50, 50, 57 , 500,450.0},
                        { "南航明珠银卡会员", "明珠经济舱","美洲","中国",32, 50, 50, 57 ,32, 50, 50, 57 , 500,0.0},
                        { "成人", "明珠经济舱","中西亚","中国",-1, 50, 50, 57 ,33, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",53, -2, 50, 57 ,53, 50, 50, 57 , 500,-1.0},
                        { "南航明珠银卡会员", "明珠经济舱","美洲","中国",32, 50, 50, 57 ,32, 50, 50, 57 , 500,0.0},
                        { "成人", "明珠经济舱","中西亚","中国",-1, 50, 50, 57 ,33, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",53, -2, 50, 57 ,53, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","韩国","中国",22, 44, 50, 57 ,22, 50, 50, 57 , 500,450.0},
                        { "南航明珠金卡会员", "明珠经济舱","韩国","中国",22, 44, 50, 57 ,22, 50, 50, 57 , 500,450.0},
                        { "南航明珠银卡会员", "明珠经济舱","美洲","中国",32, 50, 50, 57 ,32, 50, 50, 57 , 500,0.0},
                        { "成人", "明珠经济舱","中西亚","中国",-1, 50, 50, 57 ,33, 50, 50, 57 , 500,-1.0},
                        { "南航明珠金卡会员", "明珠经济舱","内罗毕","中国",53, -2, 50, 57 ,53, 50, 50, 57 , 500,-1.0},



                };
    }
    @Test(dataProvider = "test1")
    public void f(String chengkezhonglei,String jicang,String shifa,String daoda,int a,int b,int c,int d,int e,double f) {
        Ren r=new Ren();
        r.setChengkezhonglei(chengkezhonglei);
        r.setJicang(jicang);
        r.setShifa(shifa);
        r.setDaoda(daoda);
        r.Setxingli(a, b, c, d);
        Xinglijiance X=new Xinglijiance();
        X.xinglijiance(r, e);
        //System.out.print(X.xinglijiance(r, 500));
        assertEquals(f,X.xinglijiance(r, 500),"Right");
        /*assertEquals(0.0,0.0,"Right");*/
    }
    @Test(dataProvider = "test2")
    public void f2(String chengkezhonglei,String jicang,String shifa,String daoda,int a,int b,int c,int d,int a1,int b1,int c1,int d1,int a2,int b2,int c2,int d2,int e,double f) {
        Ren r=new Ren();
        r.setChengkezhonglei(chengkezhonglei);
        r.setJicang(jicang);
        r.setShifa(shifa);
        r.setDaoda(daoda);
        r.Setxingli(a, b, c, d);
        r.Setxingli(a1, b1, c1, d1);
        r.Setxingli(a2, b2, c2, d2);
        Xinglijiance X=new Xinglijiance();
        X.xinglijiance(r, e);
        //System.out.print(X.xinglijiance(r, 500));
        assertEquals(f,X.xinglijiance(r, 500),"Right");
        /*assertEquals(0.0,0.0,"Right");*/
    }
    @Test(dataProvider = "test3")
    public void f3(String chengkezhonglei,String jicang,String shifa,String daoda,int a,int b,int c,int d,int a1,int b1,int c1,int d1,int e,double f) {
        Ren r=new Ren();
        r.setChengkezhonglei(chengkezhonglei);
        r.setJicang(jicang);
        r.setShifa(shifa);
        r.setDaoda(daoda);
        r.Setxingli(a, b, c, d);
        r.Setxingli(a1, b1, c1, d1);
        Xinglijiance X=new Xinglijiance();
        X.xinglijiance(r, e);
        //System.out.print(X.xinglijiance(r, 500));
        assertEquals(f,X.xinglijiance(r, 500),"Right");
        /*assertEquals(0.0,0.0,"Right");*/
    }

}

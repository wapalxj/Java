package baozi;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/7/16.
 * 9个盘子装30个包子，每个盘子必须有包子，而且只能是单数，不能是双数，计算：没有这样的结果
 */
public class Baozi {
    public static void main(String[] args) {
        int[] dishes=new int[9];
        for (int i=0;i<dishes.length;i++){
            dishes[i]++;
        }

//        int temp=30-9;//装30个没有结果
        int temp=29-9;//装29个
//        System.out.println(Arrays.toString(dishes));
        for (int a=0;a<temp;a++){
            dishes[0]+=a;
            for (int b=0;b<temp-a;b++){
                dishes[1]+=b;
                for (int c=0;a<temp-a-b;c++){
                    dishes[2]+=c;
                    for (int d=0;d<temp-a-b-c;d++){
                        dishes[3]+=d;
                        for (int e=0;e<temp-a-b-c-d;e++){
                            dishes[4]+=e;
                            for (int f=0;f<temp-a-b-c-d-e;f++){
                                dishes[5]+=f;
                                for (int g=0;g<temp-a-b-c-d-e-f;g++){
                                    dishes[6]+=g;
                                    for (int h=0;h<temp-a-b-c-d-e-f-g;h++){
                                        dishes[7]+=h;
                                        dishes[8]+=temp-a-b-c-d-e-f-g-h;

                                        if (dishes[0]%2!=0 && dishes[1]%2!=0 && dishes[2]%2!=0 && dishes[3]%2!=0 && dishes[4]%2!=0 && dishes[5]%2!=0 && dishes[6]%2!=0 && dishes[7]%2!=0 && dishes[8]%2!=0)
                                            System.out.println(Arrays.toString(dishes));


                                        dishes[8]=1;
                                        dishes[7]=1;
                                    }
                                    dishes[6]=1;
                                }
                                dishes[5]=1;
                            }
                            dishes[4]=1;
                        }
                        dishes[3]=1;
                    }
                    dishes[2]=1;
                }
                dishes[1]=1;
            }
            dishes[0]=1;
        }

    }
}

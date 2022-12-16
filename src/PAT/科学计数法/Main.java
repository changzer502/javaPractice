package PAT.科学计数法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//E
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = in.readLine().split("E");
        StringBuilder sb = new StringBuilder(strings[0]);
        int b = Integer.parseInt(strings[1]);   //-03
        // 删除小数点
        sb.deleteCharAt(2);  //0.00123480

        if (b > 0) {
            int c = b - (sb.length() - 2);
            // 小数部分长度大于指数
            if (c < 0) {
                sb.insert(b + 2, ".");
            } else {
                while (c-- > 0) {
                    sb.append("0");
                }
            }
        } else if (b < 0) {
            while (b++ < 0) {
                sb.insert(1, "0");
            }
            sb.insert(2, ".");
        } else {
            sb.insert(2, ".");
        }
        if (sb.charAt(0) == '+') {
            sb.deleteCharAt(0);
        }
        System.out.println(sb.toString());
    }
}

/*
#include <stdio.h>
#include <string.h>

int main(){
	char E[10000];
	scanf("%s",&E);

	int n;
	n = strlen(E);

	if(E[0]=='-'){
		printf("-");     //输出负号
	}

	int pos=0;           //E的位置
	while(E[pos] != 'E'){
		pos++;
	}

	int exp = 0; int i = 0;       //存放指数
	for(i = pos + 2; i < n; i++){
		exp = exp * 10 + (E[i] - '0');
	}
	if(exp == 0){                 //特殊情况，指数为0
		for(i = 1; i < pos; i++){
			printf("%c",E[i]);
		}
	}

	if(E[pos + 1] == '-'){      //指数为负的时候
		printf("0.");
		for(i = 0; i < exp-1; i++){
			printf("0");        //输出很多个0
		}
		printf("%c",E[1]);
		for(i = 3; i < pos; i++){
			printf("%c",E[i]);
		}
	}else{                      //指数为正
		for(i = 1; i < pos; i++){
			if(E[i] == '.')  continue;
			printf("%c",E[i]);
			if(i == exp+2 && pos - 1 != exp+2){
				printf(".");
			}
        }
		for(i = 0; i < exp - (pos - 3); i++){
			printf("0");
		}

	}
	return 0;
}


 */

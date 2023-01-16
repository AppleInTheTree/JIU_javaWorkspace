package org.opentutorials.javatutorials.numberstring;

public class type_conversion {

    /* 200 과 200.0이 같은 숫자이지만 컴퓨터에서는 전혀 다른 것으로 저장되기 때문에 형 변환과 데이터 타입의 중요성 말해주기
    * 200 =00000000 00000000 00000000 11001000
    * 200.0 = 01000011 01001000 00000000 00000000
    * 이러한 type이 다른 두 숫자를 더하려면 conversion이 필요한데 java에서 자동적으로 해주기도 하고 우리가 직접해야 하기도 한다.
    * double a = 3.0F (no error) double이 float보다 크기 때문에 자동적으로 double로 바꿔준다
    * float a = 3.0 (error) double를 float에 넣으려고 하기 때문에
    * -> 자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용
    *
    * int a = 3
    * float b = 1.0F
    * double c = a + b 먼저 a가 float으로 그다음에 4.0F가 double 4로 변환된다
    * */

    /*명시적 형변환 Explic Conversion
    * float a = (float)100.0;
    * int b = (int)100.0F; -> 100
    * */
}

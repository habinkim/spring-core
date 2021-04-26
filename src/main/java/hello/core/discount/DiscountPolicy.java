package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {


    /**
    * @author : 김하빈(hbkim@bpnsolution.com)
    * * @description : 
    * ! 
    * ? 
    * TODO : 
    * @param 
    * @return 할인 대상 금액 
    * @Date : 2021. 04. 26
    * @Time : 17:33:36
    */
    int discount(Member member, int price);

}
package lombok_test.test;

import lombok_test.model.TestVO;

public class test {
	public static void main(String[] args) {
		/*
		TestVO vo = new TestVO();
		vo.setA("A");
		vo.setB("B");
		vo.setC(3);
		
		System.out.println("==============");		
		System.out.println(vo.toString());
		System.out.println("==============");
		*/
		TestVO vo = TestVO.builder().a("A").b("B").c(3).build();
		System.out.println(vo);
	}
}

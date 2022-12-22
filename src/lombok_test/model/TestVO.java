package lombok_test.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class TestVO {
	String a;
	String b;
	@Builder.Default  private int c = 19;
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution387 {

	public int firstUniqChar(String s) {
		
		if (s== null || s.length() == 0) {
			return -1;
		}
		
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		String[] strs = s.split("");
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			if (set.add(str)) {
				list.add(str);
			} else {
				list.remove(str);
			}
			if (set.size() == 26 && list.size()==0) {
				return i;
			}
		}
		
		if (list.size() > 0) {
			return s.indexOf(list.get(0));
		} else {
			return -1;
		}
		
	}
	
}

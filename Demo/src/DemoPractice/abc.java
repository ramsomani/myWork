package DemoPractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class abc {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			abc other = (abc) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		public static void main(String[] args) {
			abc obj1=new abc();
			abc obj2=new abc();
			obj1.setName("a");
			obj2.setName("a");
			Set<abc> xyz=new HashSet<abc>();
			xyz.add(obj1);
			xyz.add(obj2);
			for(abc a:xyz)
			{
				System.out.println(a);
			}
		}

		@Override
		public String toString() {
			return "abc [name=" + name + "]";
		}
		
		
}

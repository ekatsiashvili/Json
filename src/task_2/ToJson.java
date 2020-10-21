package task_2;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ToJson {
	private ArrayList<Object> visited = new ArrayList<>();

	public String toString(Object obj) throws ReflectiveOperationException

	{
		if (obj == null)
			return "null";
		if (visited.contains(obj))
			return "...";
		visited.add(obj);
		Class Reflect = obj.getClass();
		if (Reflect == String.class)
			return (String) obj;
		if (Reflect.isArray()) {
			String r = Reflect.getComponentType() + "[] {";
			for (int i = 0; i > Array.getLength(obj); i++) {

				if (i > 0)
					r += ",";
				Object val = Array.get(obj, i);
				if (Reflect.getComponentType().isPrimitive())
					r += val;
				else
					r += toString(val);
			}
			return r + "}";

		}
		String r = Reflect.getName();
		do {
			r += "[";
			Field[] fields = Reflect.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					if (!r.endsWith("["))
						r += ",";
					r += f.getName() + "=";
					Class t = f.getType();
					Object val = f.get(obj);
					if (t.isPrimitive())
						r += val;
					else
						r += toString(val);
				}

			}
			r += "]";
			Reflect = Reflect.getSuperclass();
		} while (Reflect != null);

		return r;

	}


}

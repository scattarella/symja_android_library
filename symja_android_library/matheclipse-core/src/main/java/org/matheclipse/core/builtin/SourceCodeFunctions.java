package org.matheclipse.core.builtin;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.BuiltInSymbol;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IEvaluator;
import org.matheclipse.core.interfaces.IExpr;

public class SourceCodeFunctions {

	final static String GITHUB = "https://github.com/";
	final static String POM_PATH = "axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/";
	final static String SRC_PATH = "src/main/java/";

	public final static int[] LINE_NUMBER_OF_JAVA_CLASS = new int[] { //
			0, 0, 0, 129, 138, 147, 0, 0, 0, 156, //
			0, 0, 169, 179, 0, 0, 0, 0, 0, 0, 0, //
			188, 201, 134, 225, 362, 203, 0, 506, 403, 694, 47, //
			92, 137, 181, 0, 0, 0, 475, 0, 559, 145, 31, //
			44, 0, 98, 130, 720, 381, 0, 568, 643, 176, 200, //
			282, 358, 454, 551, 609, 694, 657, 740, 832, 907, 1050, //
			500, 80, 128, 333, 781, 567, 911, 188, 82, 35, 61, //
			0, 0, 0, 51, 0, 0, 0, 0, 0, 0, 1717, //
			0, 0, 65, 103, 133, 116, 1615, 249, 564, 466, 251, //
			400, 568, 663, 735, 109, 680, 244, 873, 80, 76, 32, //
			346, 1060, 98, 0, 0, 0, 0, 203, 247, 225, 205, //
			0, 794, 880, 919, 0, 972, 1061, 0, 0, 1725, 121, //
			170, 0, 0, 47, 0, 254, 0, 452, 92, 0, 161, //
			534, 0, 488, 64, 1029, 232, 537, 227, 1218, 170, 0, //
			1186, 0, 617, 1455, 1524, 273, 200, 1209, 579, 665, 643, //
			0, 1131, 297, 330, 116, 751, 144, 248, 268, 894, 0, //
			0, 0, 0, 1247, 0, 26, 448, 1339, 949, 63, 278, //
			1732, 0, 0, 1458, 1006, 1408, 319, 381, 1017, 1074, 720, //
			0, 0, 1509, 123, 49, 109, 171, 147, 0, 428, 875, //
			1739, 790, 23, 1036, 1370, 1172, 68, 1598, 165, 240, 1705, //
			1337, 1611, 1664, 137, 2775, 19, 764, 1442, 1861, 1068, 52, //
			0, 439, 165, 52, 19, 78, 127, 1217, 376, 0, 489, //
			455, 328, 0, 0, 1687, 1832, 1939, 1129, 1757, 1748, 308, //
			82, 835, 906, 931, 997, 0, 0, 0, 241, 1264, 265, //
			298, 1075, 1121, 0, 1409, 0, 0, 334, 0, 1180, 2887, //
			532, 31, 0, 0, 1233, 0, 105, 1351, 1392, 1270, 1446, //
			1377, 1356, 605, 1163, 2028, 0, 382, 13, 0, 747, 802, //
			0, 57, 1369, 1470, 78, 93, 55, 0, 75, 218, 333, //
			428, 555, 167, 188, 0, 1169, 1403, 387, 460, 530, 3055, //
			279, 1533, 411, 1643, 842, 491, 346, 0, 0, 1472, 1962, //
			260, 324, 22, 1363, 1874, 3193, 710, 3275, 43, 33, 0, //
			1732, 0, 2158, 1488, 1930, 2192, 2177, 2230, 2323, 1921, 2076, //
			1965, 0, 2262, 296, 0, 964, 92, 0, 1029, 0, 0, //
			36, 156, 1149, 480, 635, 1093, 2299, 299, 0, 1454, 721, //
			839, 0, 0, 480, 556, 0, 546, 2337, 2379, 941, 1523, //
			14, 1564, 655, 1663, 410, 427, 497, 2394, 53, 67, 2437, //
			726, 1627, 0, 138, 1387, 605, 63, 151, 133, 1751, 1555, //
			1820, 581, 2473, 2555, 0, 0, 0, 567, 0, 29, 69, //
			0, 2099, 2056, 513, 448, 468, 526, 2188, 125, 0, 217, //
			61, 267, 314, 384, 425, 0, 0, 0, 0, 1606, 1981, //
			0, 1708, 2610, 2351, 901, 0, 775, 821, 0, 2517, 1825, //
			1980, 698, 0, 15, 1825, 502, 1686, 1764, 714, 0, 0, //
			0, 0, 248, 790, 0, 21, 299, 0, 678, 681, 739, //
			0, 845, 2573, 987, 658, 1044, 586, 836, 1739, 1056, 1995, //
			2073, 47, 2148, 0, 2122, 0, 649, 0, 854, 1793, 0, //
			0, 338, 0, 2746, 0, 369, 447, 860, 357, 918, 297, //
			0, 0, 76, 14, 46, 15, 1092, 37, 2665, 18, 1935, //
			899, 223, 788, 844, 19, 30, 959, 2004, 39, 1046, 0, //
			558, 0, 607, 675, 0, 722, 0, 762, 1989, 0, 0, //
			0, 0, 802, 2502, 842, 510, 2842, 658, 769, 0, 168, //
			247, 206, 713, 890, 0, 3478, 2545, 3580, 2180, 2448, 1865, //
			36, 2914, 713, 2040, 0, 1974, 2023, 2989, 2274, 2359, 155, //
			3105, 3183, 0, 0, 0, 0, 0, 0, 0, 0, 0, //
			0, 0, 0, 71, 0, 330, 71, 2596, 2151, 2706, 0, //
			0, 176, 223, 33, 33, 32, 0, 0, 819, 2030, 2181, //
			2203, 998, 1138, 3625, 2420, 2149, 0, 270, 193, 2386, 2756, //
			0, 0, 2882, 459, 1800, 2221, 912, 958, 975, 1044, 1155, //
			545, 977, 606, 2498, 0, 2539, 1772, 2609, 611, 2714, 2516, //
			69, 0, 0, 328, 3846, 3881, 75, 3987, 81, 1071, 671, //
			2940, 2988, 0, 143, 933, 0, 0, 2655, 28, 2746, 0, //
			382, 2283, 0, 0, 1003, 1184, 0, 3051, 2067, 0, 3236, //
			3114, 3199, 2341, 57, 29, 19, 0, 0, 0, 71, 451, //
			539, 1099, 24, 4136, 600, 2806, 3254, 2882, 0, 0, 0, //
			1231, 1290, 1376, 1436, 3268, 10, 3032, 3086, 0, 2962, 0, //
			3137, 2831, 943, 4363, 2925, 3207, 0, 0, 167, 0, 0, //
			662, 0, 2997, 0, 0, 0, 0, 2486, 0, 0, 0, //
			0, 747, 1531, 1650, 0, 1399, 58, 990, 1039, 3281, 0, //
			1260, 1306, 323, 0, 807, 3047, 19, 77, 0, 0, 4689, //
			0, 3371, 3599, 16, 1889, 1028, 3335, 3485, 0, 1062, 1460, //
			0, 0, 3628, 3658, 1083, 750, 1781, 2459, 2577, 0, 32, //
			27, 0, 0, 2717, 2958, 0, 4751, 16, 1256, 1300, 0, //
			2605, 2753, 2928, 3084, 3154, 3241, 3394, 3804, 3406, 880, 0, //
			3168, 3489, 1109, 4240, 4284, 4195, 0, 0, 3996, 4098, 3725, //
			3846, 3759, 3917, 1005, 0, 3939, 3995, 1979, 4567, 93, 1377, //
			3112, 243, 0, 3222, 0, 1113, 3271, 4885, 236, 0, 299, //
			788, 5023, 2025, 1501, 1174, 1298, 20, 12, 59, 92, 170, //
			246, 297, 440, 5054, 4176, 4331, 4048, 0, 4418, 0, 0, //
			0, 1086, 0, 2066, 0, 0, 0, 221, 0, 0, 0, //
			0, 4297, 4520, 4597, 4741, 4847, 5172, 4919, 884, 2176, 4958, //
			3324, 4994, 0, 1389, 155, 3890, 1275, 0, 1376, 5088, 5161, //
			149, 1419, 0, 3405, 1198, 1242, 1449, 3474, 0, 3516, 3601, //
			3678, 0, 1559, 2230, 2381, 0, 5237, 5280, 24, 23, 0, //
			0, 1079, 1421, 1697, 1373, 322, 1508, 32, 188, 0, 4546, //
			4692, 1504, 133, 2487, 1246, 2657, 3499, 2760, 1356, 5242, 0, //
			0, 1537, 80, 1647, 1727, 2226, 0, 892, 978, 0, 0, //
			5379, 5448, 4757, 4200, 1139, 493, 5333, 0, 5367, 1508, 4337, //
			4443, 0, 0, 228, 325, 364, 401, 422, 457, 478, 513, //
			0, 551, 600, 678, 735, 332, 1539, 1619, 5396, 0, 5508, //
			4523, 0, 43, 1600, 0, 4986, 4941, 138, 350, 0, 4798, //
			0, 5556, 2325, 1811, 1845, 0, 0, 1176, 772, 1234, 0, //
			5627, 198, 1655, 1729, 5986, 6171, 6217, 5827, 2883, 3026, 3804, //
			15, 645, 407, 539, 573, 428, 0, 795, 1901, 1999, 2529, //
			2356, 177, 100, 5100, 6068, 2511, 826, 866, 3606, 3634, 912, //
			928, 675, 3534, 3943, 0, 0, 6309, 3674, 2584, 2619, 0, //
			3744, 667, 0, 45, 51, 32, 0, 3919, 0, 1777, 0, //
			0, 0, 0, 4008, 2699, 5639, 6402, 1814, 360, 1548, 3908, //
			0, 4604, 0, 267, 4068, 1899, 1966, 2039, 997, 3957, 1267, //
			368, 4013, 0, 4297, 5860, 4077, 1317, 1199, 1264, 1326, 0, //
			5955, 954, 988, 1022, 1066, 0, 0, 2767, 2835, 0, 0, //
			1434, 1496, 2889, 0, 4140, 0, 1888, 0, 1699 };

	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			S.FunctionURL.setEvaluator(new FunctionURL());
		}
	}

	private static class FunctionURL extends AbstractEvaluator {
		private static String buildURL(final Class<?> clazz, int line) {
			StringBuilder buf = new StringBuilder(512);
			buf.append(GITHUB);
			buf.append(POM_PATH);
			buf.append(SRC_PATH);
			String canonicalName = clazz.getCanonicalName();
			String packageName = clazz.getPackage().getName();
			String parentClass = canonicalName.substring(packageName.length() + 1);
			int index = parentClass.indexOf('.');
			if (index > 0) {
				parentClass = parentClass.substring(0, index);
			}
			String packagePath = packageName.replace('.', '/');
			buf.append(packagePath);
			buf.append('/');
			buf.append(parentClass);
			buf.append(".java#L");
			buf.append(line);
			return buf.toString();
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.arg1().isBuiltInSymbol()) {
				IBuiltInSymbol builtin = (IBuiltInSymbol) ast.arg1();

				int ordinal = builtin.ordinal();
				if (ordinal > 0 && ordinal < LINE_NUMBER_OF_JAVA_CLASS.length) {
					int line = LINE_NUMBER_OF_JAVA_CLASS[ordinal];
					if (line > 0) {
						IEvaluator eval = builtin.getEvaluator();
						Class<? extends IEvaluator> clazz = eval.getClass();
						if (eval != null && eval != BuiltInSymbol.DUMMY_EVALUATOR) {
							String str = buildURL(clazz, line);
							return F.stringx(str);
						}
					}
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize(IAST ast) {
			return IOFunctions.ARGS_1_1;
		}
	}

	public static void initialize() {
		Initializer.init();
	}

	private SourceCodeFunctions() {

	}

}

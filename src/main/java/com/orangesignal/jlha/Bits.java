/**
 * Copyright (C) 2002  Michel Ishizuka  All rights reserved.
 * 
 * 以下の条件に同意するならばソースとバイナリ形式の再配布と使用を
 * 変更の有無にかかわらず許可する。
 * 
 * １．ソースコードの再配布において著作権表示と この条件のリスト
 *     および下記の声明文を保持しなくてはならない。
 * 
 * ２．バイナリ形式の再配布において著作権表示と この条件のリスト
 *     および下記の声明文を使用説明書もしくは その他の配布物内に
 *     含む資料に記述しなければならない。
 * 
 * このソフトウェアは石塚美珠瑠によって無保証で提供され、特定の目
 * 的を達成できるという保証、商品価値が有るという保証にとどまらず、
 * いかなる明示的および暗示的な保証もしない。
 * 石塚美珠瑠は このソフトウェアの使用による直接的、間接的、偶発
 * 的、特殊な、典型的な、あるいは必然的な損害(使用によるデータの
 * 損失、業務の中断や見込まれていた利益の遺失、代替製品もしくは
 * サービスの導入費等が考えられるが、決してそれだけに限定されない
 * 損害)に対して、いかなる事態の原因となったとしても、契約上の責
 * 任や無過失責任を含む いかなる責任があろうとも、たとえそれが不
 * 正行為のためであったとしても、またはそのような損害の可能性が報
 * 告されていたとしても一切の責任を負わないものとする。
 */

package com.orangesignal.jlha;

/**
 * ビット処理のためのユーティリティメソッド群。
 * 
 * @author $Author: dangan $
 * @version $Revision: 1.0 $
 */
public final class Bits {

	private Bits() {}

	/**
	 * val のビット長を得る。 val は符号なし 32ビット整数とみなされる。 log2( (long)val & 0xFFFFFFFFL ) の戻り値の 小数点以下を切り捨てたものと同等。
	 * 
	 * @param val 整数値
	 * 
	 * @return val のビット長
	 */
	public static int len(int val) {
		int len = 0;
		while (0 != val) {
			val >>>= 1;
			len++;
		}
		return len;
	}

}
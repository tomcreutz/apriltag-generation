
package april.tag;

/** Tag family with 21 distinct codes.
    bits: 20,  minimum hamming: 7

    Max bits corrected       False positive rate
            0                  0,00200272 %
            1                  0,04205704 %
            2                  0,42257309 %
            3                  2,70566940 %

    Generation time: 1,617000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  0
       7  78
       8  89
       9  29
      10  11
      11  3
      12  0
      13  0
      14  0
      15  0
      16  0
      17  0
      18  0
      19  0
      20  0
**/
public class TagCustom20h7 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0xf2b3fL, 0x94dddL, 0x75967L, 0x6bb7cL, 0xa62cdL, 0x2ed45L, 0xd6c33L, 0xad9d2L, 0x8d92bL, 0xaa90eL, 0x657a1L, 0xf9ab9L, 0xef2f0L, 0x686afL, 0x894b6L, 0x50a6dL, 0x15b91L, 0xa4f32L, 0xb945fL, 0xfafd0L, 0xcb177L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[21];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 21);
		return codes;
	}

	public TagCustom20h7()
	{
		super(ImageLayout.Factory.createFromString("Custom", "wwwwwwwwwwwbbbbbbbbwwbddddddbwwbdxxxxdbwwbdxxxxdbwwbdxxxxdbwwbdxxxxdbwwbddddddbwwbbbbbbbbwwwwwwwwwww"), 7, constructCodes());
	}
}


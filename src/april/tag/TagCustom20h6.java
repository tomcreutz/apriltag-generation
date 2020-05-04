
package april.tag;

/** Tag family with 63 distinct codes.
    bits: 20,  minimum hamming: 6

    Max bits corrected       False positive rate
            0                  0,00600815 %
            1                  0,12617111 %
            2                  1,26771927 %

    Generation time: 1,699000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  464
       7  473
       8  530
       9  256
      10  173
      11  51
      12  4
      13  2
      14  0
      15  0
      16  0
      17  0
      18  0
      19  0
      20  0
**/
public class TagCustom20h6 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0xf6351L, 0xb7a65L, 0x88bb4L, 0x6973eL, 0x2ae52L, 0xec566L, 0xadc7aL, 0x5f953L, 0x655a3L, 0x55b68L, 0x366f2L, 0x4bd7dL, 0xbf16aL, 0x9fcf4L, 0xa5944L, 0xab594L, 0xefad0L, 0xa73f9L, 0x4f2e7L, 0xe1b4aL, 0xa325eL, 0xa8eaeL, 0xbe539L, 0x9e492L, 0x465d3L, 0x52cf7L, 0x5a64fL, 0x69459L, 0xc5959L, 0xbb636L, 0x7dbceL, 0xcf45fL, 0x46e8dL, 0xd26e4L, 0xdb89eL, 0xadd17L, 0x3de94L, 0xae663L, 0x11addL, 0x92dbeL, 0x2c59bL, 0xdca12L, 0xcf7ecL, 0xf17eeL, 0x6ee6cL, 0x6eb87L, 0x7354aL, 0xd49d7L, 0x6474bL, 0xed8bcL, 0xa4b89L, 0xd590eL, 0xc8d5aL, 0x8d548L, 0x154beL, 0xd3855L, 0x4af9eL, 0xd328bL, 0xfb958L, 0xc15b5L, 0x395aaL, 0xa909aL, 0xfcf3fL };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[63];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 63);
		return codes;
	}

	public TagCustom20h6()
	{
		super(ImageLayout.Factory.createFromString("Custom", "wwwwwwwwwwwbbbbbbbbwwbddddddbwwbdxxxxdbwwbdxxxxdbwwbdxxxxdbwwbdxxxxdbwwbddddddbwwbbbbbbbbwwwwwwwwwww"), 6, constructCodes());
	}
}


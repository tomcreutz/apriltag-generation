#include <stdlib.h>
#include "tagCustom20h7.h"

apriltag_family_t *tagCustom20h7_create()
{
   apriltag_family_t *tf = calloc(1, sizeof(apriltag_family_t));
   tf->name = strdup("tagCustom20h7");
   tf->h = 7;
   tf->ncodes = 21;
   tf->codes = calloc(21, sizeof(uint64_t));
   tf->codes[0] = 0x00000000000f2b3fUL;
   tf->codes[1] = 0x0000000000094dddUL;
   tf->codes[2] = 0x0000000000075967UL;
   tf->codes[3] = 0x000000000006bb7cUL;
   tf->codes[4] = 0x00000000000a62cdUL;
   tf->codes[5] = 0x000000000002ed45UL;
   tf->codes[6] = 0x00000000000d6c33UL;
   tf->codes[7] = 0x00000000000ad9d2UL;
   tf->codes[8] = 0x000000000008d92bUL;
   tf->codes[9] = 0x00000000000aa90eUL;
   tf->codes[10] = 0x00000000000657a1UL;
   tf->codes[11] = 0x00000000000f9ab9UL;
   tf->codes[12] = 0x00000000000ef2f0UL;
   tf->codes[13] = 0x00000000000686afUL;
   tf->codes[14] = 0x00000000000894b6UL;
   tf->codes[15] = 0x0000000000050a6dUL;
   tf->codes[16] = 0x0000000000015b91UL;
   tf->codes[17] = 0x00000000000a4f32UL;
   tf->codes[18] = 0x00000000000b945fUL;
   tf->codes[19] = 0x00000000000fafd0UL;
   tf->codes[20] = 0x00000000000cb177UL;
   tf->nbits = 20;
   tf->bit_x = calloc(20, sizeof(uint32_t));
   tf->bit_y = calloc(20, sizeof(uint32_t));
   tf->bit_x[0] = 1;
   tf->bit_y[0] = 1;
   tf->bit_x[1] = 2;
   tf->bit_y[1] = 1;
   tf->bit_x[2] = 3;
   tf->bit_y[2] = 1;
   tf->bit_x[3] = 4;
   tf->bit_y[3] = 1;
   tf->bit_x[4] = 5;
   tf->bit_y[4] = 1;
   tf->bit_x[5] = 6;
   tf->bit_y[5] = 1;
   tf->bit_x[6] = 6;
   tf->bit_y[6] = 2;
   tf->bit_x[7] = 6;
   tf->bit_y[7] = 3;
   tf->bit_x[8] = 6;
   tf->bit_y[8] = 4;
   tf->bit_x[9] = 6;
   tf->bit_y[9] = 5;
   tf->bit_x[10] = 6;
   tf->bit_y[10] = 6;
   tf->bit_x[11] = 5;
   tf->bit_y[11] = 6;
   tf->bit_x[12] = 4;
   tf->bit_y[12] = 6;
   tf->bit_x[13] = 3;
   tf->bit_y[13] = 6;
   tf->bit_x[14] = 2;
   tf->bit_y[14] = 6;
   tf->bit_x[15] = 1;
   tf->bit_y[15] = 6;
   tf->bit_x[16] = 1;
   tf->bit_y[16] = 5;
   tf->bit_x[17] = 1;
   tf->bit_y[17] = 4;
   tf->bit_x[18] = 1;
   tf->bit_y[18] = 3;
   tf->bit_x[19] = 1;
   tf->bit_y[19] = 2;
   tf->width_at_border = 8;
   tf->total_width = 10;
   tf->reversed_border = false;
   return tf;
}

void tagCustom20h7_destroy(apriltag_family_t *tf)
{
   free(tf->codes);
   free(tf->bit_x);
   free(tf->bit_y);
   free(tf->name);
   free(tf);
}

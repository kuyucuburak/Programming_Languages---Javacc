/* Generated By:JavaCC: Do not edit this line. ETU_TVLTokenManager.java */
import java.util.List;
import java.util.ArrayList;

/** Token Manager. */
public class ETU_TVLTokenManager implements ETU_TVLConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xfff00L) != 0L)
         {
            jjmatchedKind = 26;
            return 10;
         }
         return -1;
      case 1:
         if ((active0 & 0x80000L) != 0L)
            return 10;
         if ((active0 & 0x7ff00L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 1;
            return 10;
         }
         return -1;
      case 2:
         if ((active0 & 0x60000L) != 0L)
            return 10;
         if ((active0 & 0x1ff00L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 2;
            return 10;
         }
         return -1;
      case 3:
         if ((active0 & 0x4000L) != 0L)
            return 10;
         if ((active0 & 0x1bf00L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
            return 10;
         }
         return -1;
      case 4:
         if ((active0 & 0x9000L) != 0L)
            return 10;
         if ((active0 & 0x12700L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
            return 10;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x2000L) != 0L)
            return 10;
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         if ((active0 & 0x10700L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 5;
            return 10;
         }
         return -1;
      case 6:
         if ((active0 & 0x10100L) != 0L)
            return 10;
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 6;
            return 10;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 7;
            return 10;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 8;
            return 10;
         }
         return -1;
      case 9:
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 9;
            return 10;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 10;
            return 10;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 11;
            return 10;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 12;
            return 10;
         }
         return -1;
      case 13:
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 13;
            return 10;
         }
         return -1;
      case 14:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         return -1;
      case 17:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         return -1;
      case 18:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
         {
            if (jjmatchedPos < 10)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 10;
            }
            return -1;
         }
         return -1;
      case 19:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         return -1;
      case 20:
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 13)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 13;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 44:
         return jjStopAtPos(0, 23);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 59:
         return jjStopAtPos(0, 22);
      case 61:
         return jjStopAtPos(0, 24);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x1400L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x82000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(1, 1);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x8800L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x31400L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 82:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x4100L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 68:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 10);
         break;
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0xc00L);
      case 75:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 84:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 10);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 10);
         break;
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x10800L);
      case 80:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 69:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 10);
         break;
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 84:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 10);
         break;
      case 85:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x500L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 83:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 84:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 10);
         break;
      case 87:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 69:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 77:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(6, 8, 10);
         break;
      case 78:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 84:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa9_0(active0, 0x200L);
      case 84:
         return jjMoveStringLiteralDfa9_0(active0, 0x800L);
      case 90:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa10_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa10_0(active0, 0x800L);
      case 79:
         return jjMoveStringLiteralDfa10_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa11_0(active0, 0x200L);
      case 79:
         return jjMoveStringLiteralDfa11_0(active0, 0x800L);
      case 84:
         return jjMoveStringLiteralDfa11_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa12_0(active0, 0x200L);
      case 73:
         return jjMoveStringLiteralDfa12_0(active0, 0x400L);
      case 78:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(11, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa13_0(active0, 0x400L);
      case 83:
         return jjMoveStringLiteralDfa13_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa14_0(active0, 0x200L);
      case 78:
         return jjMoveStringLiteralDfa14_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa15_0(active0, 0x400L);
      case 67:
         return jjMoveStringLiteralDfa15_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa16_0(active0, 0x400L);
      case 84:
         return jjMoveStringLiteralDfa16_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa17_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa17_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa18_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa18_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(18, 9);
         break;
      case 84:
         return jjMoveStringLiteralDfa19_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
static private int jjMoveStringLiteralDfa19_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0);
      return 19;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa20_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(18, active0);
}
static private int jjMoveStringLiteralDfa20_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0);
      return 20;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa21_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0);
}
static private int jjMoveStringLiteralDfa21_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0);
      return 21;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(21, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(20, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  break;
               case 1:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 3:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if (curChar == 39 && kind > 25)
                     kind = 25;
                  break;
               case 5:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  break;
               case 6:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(6);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(10);
                  break;
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if (curChar == 92)
                     jjAddStates(7, 9);
                  break;
               case 3:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 2)
                     kind = 2;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 4, 1, 2, 6, 4, 3, 5, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\120\122\117\107\122\101\115", 
"\104\105\103\114\101\122\101\124\111\117\116\40\123\105\103\124\111\117\116", 
"\111\116\111\124\111\101\114\111\132\101\124\111\117\116\40\123\105\103\124\111\117\116", "\115\101\111\116\40\123\105\103\124\111\117\116", "\111\116\120\125\124", 
"\117\125\124\120\125\124", "\124\122\125\105", "\106\101\114\123\105", "\125\116\113\116\117\127\116", 
"\101\116\104", "\116\117\124", "\117\122", "\50", "\51", "\73", "\54", "\75", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffff01L, 
};
static final long[] jjtoSkip = {
   0xf4L, 
};
static final long[] jjtoSpecial = {
   0x4L, 
};
static final long[] jjtoMore = {
   0xaL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[11];
static private final int[] jjstateSet = new int[22];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public ETU_TVLTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ETU_TVLTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 3)
         {
            jjmatchedKind = 3;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}

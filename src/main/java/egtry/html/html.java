/* html.java */
/* Generated By:JavaCC: Do not edit this line. html.java */
package egtry.html;
import java.io.StringReader;


public class html implements htmlConstants {

    public static void main(String[] args) throws Exception {
     try {
            new html(new StringReader(args[0])).create();
            System.out.println("Syntax is okay");

        } catch (Throwable e) {
            System.out.println("Syntax check failed: "+ e.getMessage() );
        }
    }

  final public void create() throws ParseException, ParseException {
    jj_consume_token(12);
    element();
    jj_consume_token(NewLine);
}

  final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 13:{
      img();
      break;
      }
    case 17:{
      para();
      break;
      }
    case 18:{
      url();
      break;
      }
    case 16:{
      header();
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void img() throws ParseException {
    jj_consume_token(13);
    jj_consume_token(14);
    jj_consume_token(15);
    quote();
    sentence();
    quote();
}

  final public void header() throws ParseException, ParseException {
    jj_consume_token(16);
    decorated_text();
}

  final public void para() throws ParseException {
    jj_consume_token(17);
    decorated_text();
}

  final public void url() throws ParseException {
    jj_consume_token(18);
    decorated_url();
}

  final public void decorated_text() throws ParseException, ParseException {
    jj_consume_token(14);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 20:{
      text();
      break;
      }
    case 21:{
      color();
      break;
      }
    case 22:{
      font();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 19:{
      jj_consume_token(19);
      decorated_text();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
}

  final public void decorated_url() throws ParseException {
    jj_consume_token(14);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 20:{
      text();
      break;
      }
    case 21:{
      color();
      break;
      }
    case 22:{
      font();
      break;
      }
    case 18:{
      link();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 19:{
      jj_consume_token(19);
      decorated_url();
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
}

  final public void link() throws ParseException {
    jj_consume_token(18);
    quote();
    sentence();
    quote();
}

  final public void text() throws ParseException {
    jj_consume_token(20);
    quote();
    sentence();
    quote();
}

  final public void color() throws ParseException {
    jj_consume_token(21);
    quote();
    sentence();
    quote();
}

  final public void font() throws ParseException {
    jj_consume_token(22);
    quote();
    sentence();
    quote();
}

  final public void sentence() throws ParseException {
    alphanumeric();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 4:
    case 5:
    case 6:
    case NUM:
    case ID:
    case CAP:
    case EPSILON:
    case 24:{
      if (jj_2_1(2147483647)) {
        sentence();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EPSILON:{
          jj_consume_token(EPSILON);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
}

  final public void quote() throws ParseException {
    jj_consume_token(23);
}

  final public void alphanumeric() throws ParseException, ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUM:{
      jj_consume_token(NUM);
      break;
      }
    case ID:{
      jj_consume_token(ID);
      break;
      }
    case CAP:{
      jj_consume_token(CAP);
      break;
      }
    case 4:{
      jj_consume_token(4);
      break;
      }
    case 5:{
      jj_consume_token(5);
      break;
      }
    case 6:{
      jj_consume_token(6);
      break;
      }
    case 24:{
      jj_consume_token(24);
      break;
      }
    case EPSILON:{
      jj_consume_token(EPSILON);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_3R_sentence_92_17_4()
 {
    if (jj_3R_sentence_92_1_1()) return true;
    return false;
  }

  private boolean jj_3R_sentence_92_17_3()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_sentence_92_17_4()) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) return true;
    }
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_sentence_92_1_1()) return true;
    return false;
  }

  private boolean jj_3R_sentence_92_1_1()
 {
    if (jj_3R_alphanumeric_101_2_2()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_sentence_92_17_3()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_alphanumeric_101_2_2()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(7)) {
    jj_scanpos = xsp;
    if (jj_scan_token(8)) {
    jj_scanpos = xsp;
    if (jj_scan_token(9)) {
    jj_scanpos = xsp;
    if (jj_scan_token(4)) {
    jj_scanpos = xsp;
    if (jj_scan_token(5)) {
    jj_scanpos = xsp;
    if (jj_scan_token(6)) {
    jj_scanpos = xsp;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) return true;
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  /** Generated Token Manager. */
  public htmlTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x72000,0x700000,0x80000,0x740000,0x80000,0x400,0x10007f0,0x10007f0,};
	}
  final private JJCalls[] jj_2_rtns = new JJCalls[1];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public html(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public html(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new htmlTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public html(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new htmlTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new htmlTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public html(htmlTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(htmlTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[25];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 8; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 25; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 1; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

}

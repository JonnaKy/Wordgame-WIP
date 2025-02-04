package inputmethod;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.wordgame.R;

public class MyKeyboard extends InputMethodService {

    @Override
    public View onCreateInputView(){
        //retrieve layout inflater service
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.keyboard, null);

        //set up buttons
        Button a = (Button) view.findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //insert button 'char' into the edit field
                getCurrentInputConnection().commitText("A",1);
            }
        });

        Button b = (Button) view.findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("B",1);
            }
        });

        Button c = (Button) view.findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("C", 1);
            }
        });

        Button d = (Button) view.findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("D", 1);
            }
        });

        Button e = (Button) view.findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("E",1);
            }
        });

        Button f = (Button) view.findViewById(R.id.f);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("F", 1);
            }
        });

        Button g = (Button) view.findViewById(R.id.g);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("G",1);
            }
        });

        Button h = (Button) view.findViewById(R.id.h);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("H",1);
            }
        });

        Button i = (Button) view.findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("I",1);
            }
        });

        Button j = (Button)  view.findViewById(R.id.j);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("J",1);
            }
        });

        Button k = (Button) view.findViewById(R.id.k);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("K",1);
            }
        });

        Button l = (Button) view.findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("L",1);
            }
        });

        Button m = (Button) view.findViewById(R.id.m);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("M",1);
            }
        });

        Button n = (Button) view.findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("N",1);
            }
        });

        Button o = (Button) view.findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("O",1);
            }
        });

        Button p = (Button)  view.findViewById(R.id.p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("P",1);
            }
        });

        Button q = (Button) view.findViewById(R.id.q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Q",1);
            }
        });

        Button r = (Button) view.findViewById(R.id.r);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("R",1);
            }
        });

        Button s = (Button) view.findViewById(R.id.s);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("S",1);
            }
        });

        Button t = (Button) view.findViewById(R.id.t);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("T",1);
            }
        });

        Button u = (Button) view.findViewById(R.id.u);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("U",1);
            }
        });

        Button v = (Button) view.findViewById(R.id.v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("V",1);
            }
        });

        Button w = (Button) view.findViewById(R.id.w);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("W",1);
            }
        });

        Button x = (Button) view.findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("X",1);
            }
        });

        Button y = (Button) view.findViewById(R.id.y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Y",1);
            }
        });

        Button z = (Button) view.findViewById(R.id.z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Z",1);
            }
        });

        Button aa = (Button) view.findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Å",1);
            }
        });

        Button ae = (Button) view.findViewById(R.id.ae);
        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Ä",1);
            }
        });

        Button oe = (Button) view.findViewById(R.id.oe);
        oe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().commitText("Ö",1);
            }
        });

        Button backspace = view.findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentInputConnection().deleteSurroundingText(1,0);
            }
        });

        return view;
    }
}

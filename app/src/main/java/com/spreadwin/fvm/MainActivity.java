package com.spreadwin.fvm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {
    private sectorView sectorView;
    private SeekBar seekBar;
    private TextView angeleText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }
    private  void initView(){
        sectorView= (sectorView) findViewById(R.id.cccc);
        seekBar= (SeekBar) findViewById(R.id.seekbar);
        angeleText= (TextView) findViewById(R.id.angleText);

        seekBar.setMax(180);
        seekBar.setProgress(80);
        sectorView.setDegree(80);

        FvmNative fvmNative=new FvmNative();
    }
    private  void initListener(){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                sectorView.setDegree(seekBar.getProgress());
                angeleText.setText(i+"°");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}

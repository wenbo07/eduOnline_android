package cn.coderss.adapter;

import java.util.ArrayList;

import cn.coderss.edu.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class VideoDetailAdapter extends BaseAdapter {
	ArrayList datalist;
	Context mcontext;
	View mview;
	
	public VideoDetailAdapter(ArrayList datalist, Context mcontext) {
		super();
		this.datalist = datalist;
		this.mcontext = mcontext;
	}

	
	@Override
	public int getCount() {
		return datalist.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View v, ViewGroup viewgroup) {
		LayoutInflater li=LayoutInflater.from(mcontext);
		mview=li.inflate(R.layout.adapter_video_menu, null);
		return mview;
	}

}

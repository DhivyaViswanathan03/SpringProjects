package com.divs.comp;

import java.util.Arrays;

public class MarksInfo {
private int[] markInfo;
static {
	System.out.println("MarksInfo class is loading..");
}

public void setMarkInfo(int[] markInfo) {
	this.markInfo = markInfo;
	
}

@Override
public String toString() {
	return "MarksInfo [markInfo=" + Arrays.toString(markInfo) + "]";
}

}

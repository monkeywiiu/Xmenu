# Xmenu
## How to use
### Step1
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  	dependencies {
	        compile 'com.github.monkeywiiu:Xmenu:-SNAPSHOT'
	}
### Step2

```
   <com.example.zmenu.SnakeButtonLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/container"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
</com.example.zmenu.SnakeButtonLayout>
```
`just like RelativeLayout`
### Step3

        //设置图片和颜色
        PUtils.getInstance().setImagesAndColors(List<Integer> imageList, List<Integer> colorList);

        //设置悬浮按钮的margin
        PUtils.getInstance().setMargin((int) getResources().getDimension(R.dimen.margin));
        
        setContentView(R.layout.activity_main);
 ` Remember `:  set this before  `setContentView(..) `
 
 ![image](https://github.com/ZhengYaWei1992/ZWProgressView/blob/master/Untitled3.gif)

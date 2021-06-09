# PromotionalMyAppsLib
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
  
```
  	dependencies {
	        implementation 'com.github.immujahidkhan:PromotionalMyAppsLib:Tag'
	}
```

#Usage

```

<fragment
        android:id="@+id/promo"
        android:tag="URL HERE"
        android:name="com.justclack.promoapps.PromoAppAdsFragment"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

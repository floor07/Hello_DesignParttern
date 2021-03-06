package observer.diy;


/**  
* @ClassName: Subject <br/>
* @Description: 主题对象用于，注册，移除，通知<br/>  
* @author wenl <br/>
* @date 2017年5月15日 下午1:41:24  <br/>
*    
*/
public interface Subject {

	boolean registerObserver(Observer observer);
	boolean removeObserver(Observer observer);
	void notifyObservers();
	 void setMeasurements(Double temp,Double humidity,Double pressure);
}

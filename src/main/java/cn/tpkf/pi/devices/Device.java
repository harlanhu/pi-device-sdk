package cn.tpkf.pi.devices;

/**
 * @author Harlan
 * @email isharlan.hu@gmali.com
 * @date 2023/11/22
 */
public interface Device {

    /**
     * 获取设备id
     * @return 设备id
     */
    String getId();

    /**
     * 获取设备名称
     * @return 设备名称
     */
    String getName();
}

package proxy.staticProxy.impl;

import proxy.staticProxy.interfaces.IUserDao;

/**
 * ��������,��̬����
 */
public class UserDaoProxy implements IUserDao{
    //���ձ���Ŀ�����
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    public void save() {
        System.out.println("��ʼ����...");
        target.save();//ִ��Ŀ�����ķ���
        System.out.println("�ύ����...");
    }
}
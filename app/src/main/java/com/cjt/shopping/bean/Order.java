package com.cjt.shopping.bean;

import java.util.List;

/**
 * 作者: 陈嘉桐 on 2016/7/6
 * 邮箱: 445263848@qq.com.
 */
public class Order {

    /**
     * action : add
     * address : null
     * addressId : 0
     * count : 0
     * id : 0
     * items : 67
     * myorders : 100126
     * order : null
     * orderItem : null
     * orders : [{"address":null,"countPriceFactory":null,"expressNumber":null,"id":100126,"orderItems":null,"orderTime":"2016-07-06T16:39:46","sellPrice":null,"state":0,"store":{"address":"啊时代发生的发生","categories":[{"count":0,"id":49,"name":"好了","state":0,"storeId":20},{"count":0,"id":51,"name":"哈哈h","state":0,"storeId":20},{"count":0,"id":50,"name":"你好啊","state":0,"storeId":20},{"count":0,"id":48,"name":"爱奇艺","state":0,"storeId":20}],"clickCount":0,"createTime":"2016-06-18T23:29:20","details":"当时发生的发生","id":20,"idcard":{"address":"是否是大法师答复","id":30,"idcardImages":[{"id":13,"idcardId":30,"shopFile":{"id":99,"url":"/save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg"},"sign":null},{"id":14,"idcardId":30,"shopFile":{"id":100,"url":"/save/1009/00ab6626-3200-431c-854d-bf44077dfe81.jpg"},"sign":null},{"id":15,"idcardId":30,"shopFile":{"id":101,"url":"/save/1009/828e3340-ca26-46c6-9eaf-77ef6104ff20.jpg"},"sign":null}],"name":"许","number":"23423546567567"},"name":"啊哈U","packingFee":0,"position":null,"sellCount":0,"startFee":0,"state":1,"storeImage":{"id":18,"shopFile":{"id":117,"url":"/save/10/683f4d25-932b-4549-8dd5-7a858c458401.JPG"},"store":null},"storePrivileges":[],"vendor":{"id":9,"state":0,"store":null,"user":{"email":"34564747@qq.com","id":1009,"myAddresses":[{"consignee":"许光宇","id":26,"path":" 地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"123423","state":0,"user":null},{"consignee":"许光宇","id":27,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"23423","state":0,"user":null},{"consignee":"443534","id":25,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"443534","state":0,"user":null}],"name":"xuxu22","password":"44445555","phone":"13445567825","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}}},"totalPrice":0,"user":{"email":"345353@qq.com","id":1013,"myAddresses":[],"name":"cjt","password":"123456","phone":"18814117978","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}}]
     * result : success
     * totalPrice : 0
     * user : {"email":"345353@qq.com","id":1013,"myAddresses":[],"name":"cjt","password":"123456","phone":"18814117978","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}
     * userId : 1013
     */

    private String action;
    private Object address;
    private int addressId;
    private int count;
    private int id;
    private String items;
    private String myorders;
    private Object order;
    private Object orderItem;
    private String result;
    private float totalPrice;
    /**
     * email : 345353@qq.com
     * id : 1013
     * myAddresses : []
     * name : cjt
     * password : 123456
     * phone : 18814117978
     * power : 1
     * sex : 男
     * state : 1
     * totalOut : 0
     * vendor : null
     */

    private UserBean user;
    private String userId;
    /**
     * address : null
     * countPriceFactory : null
     * expressNumber : null
     * id : 100126
     * orderItems : null
     * orderTime : 2016-07-06T16:39:46
     * sellPrice : null
     * state : 0
     * store : {"address":"啊时代发生的发生","categories":[{"count":0,"id":49,"name":"好了","state":0,"storeId":20},{"count":0,"id":51,"name":"哈哈h","state":0,"storeId":20},{"count":0,"id":50,"name":"你好啊","state":0,"storeId":20},{"count":0,"id":48,"name":"爱奇艺","state":0,"storeId":20}],"clickCount":0,"createTime":"2016-06-18T23:29:20","details":"当时发生的发生","id":20,"idcard":{"address":"是否是大法师答复","id":30,"idcardImages":[{"id":13,"idcardId":30,"shopFile":{"id":99,"url":"/save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg"},"sign":null},{"id":14,"idcardId":30,"shopFile":{"id":100,"url":"/save/1009/00ab6626-3200-431c-854d-bf44077dfe81.jpg"},"sign":null},{"id":15,"idcardId":30,"shopFile":{"id":101,"url":"/save/1009/828e3340-ca26-46c6-9eaf-77ef6104ff20.jpg"},"sign":null}],"name":"许","number":"23423546567567"},"name":"啊哈U","packingFee":0,"position":null,"sellCount":0,"startFee":0,"state":1,"storeImage":{"id":18,"shopFile":{"id":117,"url":"/save/10/683f4d25-932b-4549-8dd5-7a858c458401.JPG"},"store":null},"storePrivileges":[],"vendor":{"id":9,"state":0,"store":null,"user":{"email":"34564747@qq.com","id":1009,"myAddresses":[{"consignee":"许光宇","id":26,"path":" 地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"123423","state":0,"user":null},{"consignee":"许光宇","id":27,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"23423","state":0,"user":null},{"consignee":"443534","id":25,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"443534","state":0,"user":null}],"name":"xuxu22","password":"44445555","phone":"13445567825","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}}}
     * totalPrice : 0
     * user : {"email":"345353@qq.com","id":1013,"myAddresses":[],"name":"cjt","password":"123456","phone":"18814117978","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}
     */

    private List<OrdersBean> orders;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getMyorders() {
        return myorders;
    }

    public void setMyorders(String myorders) {
        this.myorders = myorders;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Object getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Object orderItem) {
        this.orderItem = orderItem;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrdersBean> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersBean> orders) {
        this.orders = orders;
    }

    public static class UserBean {
        private String email;
        private int id;
        private String name;
        private String password;
        private String phone;
        private int power;
        private String sex;
        private int state;
        private int totalOut;
        private Object vendor;
        private List<?> myAddresses;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getTotalOut() {
            return totalOut;
        }

        public void setTotalOut(int totalOut) {
            this.totalOut = totalOut;
        }

        public Object getVendor() {
            return vendor;
        }

        public void setVendor(Object vendor) {
            this.vendor = vendor;
        }

        public List<?> getMyAddresses() {
            return myAddresses;
        }

        public void setMyAddresses(List<?> myAddresses) {
            this.myAddresses = myAddresses;
        }
    }

    public static class OrdersBean {
        private Object address;
        private Object countPriceFactory;
        private Object expressNumber;
        private int id;
        private Object orderItems;
        private String orderTime;
        private Object sellPrice;
        private int state;
        /**
         * address : 啊时代发生的发生
         * categories : [{"count":0,"id":49,"name":"好了","state":0,"storeId":20},{"count":0,"id":51,"name":"哈哈h","state":0,"storeId":20},{"count":0,"id":50,"name":"你好啊","state":0,"storeId":20},{"count":0,"id":48,"name":"爱奇艺","state":0,"storeId":20}]
         * clickCount : 0
         * createTime : 2016-06-18T23:29:20
         * details : 当时发生的发生
         * id : 20
         * idcard : {"address":"是否是大法师答复","id":30,"idcardImages":[{"id":13,"idcardId":30,"shopFile":{"id":99,"url":"/save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg"},"sign":null},{"id":14,"idcardId":30,"shopFile":{"id":100,"url":"/save/1009/00ab6626-3200-431c-854d-bf44077dfe81.jpg"},"sign":null},{"id":15,"idcardId":30,"shopFile":{"id":101,"url":"/save/1009/828e3340-ca26-46c6-9eaf-77ef6104ff20.jpg"},"sign":null}],"name":"许","number":"23423546567567"}
         * name : 啊哈U
         * packingFee : 0
         * position : null
         * sellCount : 0
         * startFee : 0
         * state : 1
         * storeImage : {"id":18,"shopFile":{"id":117,"url":"/save/10/683f4d25-932b-4549-8dd5-7a858c458401.JPG"},"store":null}
         * storePrivileges : []
         * vendor : {"id":9,"state":0,"store":null,"user":{"email":"34564747@qq.com","id":1009,"myAddresses":[{"consignee":"许光宇","id":26,"path":" 地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"123423","state":0,"user":null},{"consignee":"许光宇","id":27,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"23423","state":0,"user":null},{"consignee":"443534","id":25,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"443534","state":0,"user":null}],"name":"xuxu22","password":"44445555","phone":"13445567825","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}}
         */

        private StoreBean store;
        private float totalPrice;
        /**
         * email : 345353@qq.com
         * id : 1013
         * myAddresses : []
         * name : cjt
         * password : 123456
         * phone : 18814117978
         * power : 1
         * sex : 男
         * state : 1
         * totalOut : 0
         * vendor : null
         */

        private UserBean user;

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getCountPriceFactory() {
            return countPriceFactory;
        }

        public void setCountPriceFactory(Object countPriceFactory) {
            this.countPriceFactory = countPriceFactory;
        }

        public Object getExpressNumber() {
            return expressNumber;
        }

        public void setExpressNumber(Object expressNumber) {
            this.expressNumber = expressNumber;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(Object orderItems) {
            this.orderItems = orderItems;
        }

        public String getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(String orderTime) {
            this.orderTime = orderTime;
        }

        public Object getSellPrice() {
            return sellPrice;
        }

        public void setSellPrice(Object sellPrice) {
            this.sellPrice = sellPrice;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public StoreBean getStore() {
            return store;
        }

        public void setStore(StoreBean store) {
            this.store = store;
        }

        public float getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(float totalPrice) {
            this.totalPrice = totalPrice;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class StoreBean {
            private String address;
            private int clickCount;
            private String createTime;
            private String details;
            private int id;
            /**
             * address : 是否是大法师答复
             * id : 30
             * idcardImages : [{"id":13,"idcardId":30,"shopFile":{"id":99,"url":"/save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg"},"sign":null},{"id":14,"idcardId":30,"shopFile":{"id":100,"url":"/save/1009/00ab6626-3200-431c-854d-bf44077dfe81.jpg"},"sign":null},{"id":15,"idcardId":30,"shopFile":{"id":101,"url":"/save/1009/828e3340-ca26-46c6-9eaf-77ef6104ff20.jpg"},"sign":null}]
             * name : 许
             * number : 23423546567567
             */

            private IdcardBean idcard;
            private String name;
            private int packingFee;
            private Object position;
            private int sellCount;
            private int startFee;
            private int state;
            /**
             * id : 18
             * shopFile : {"id":117,"url":"/save/10/683f4d25-932b-4549-8dd5-7a858c458401.JPG"}
             * store : null
             */

            private StoreImageBean storeImage;
            /**
             * id : 9
             * state : 0
             * store : null
             * user : {"email":"34564747@qq.com","id":1009,"myAddresses":[{"consignee":"许光宇","id":26,"path":" 地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"123423","state":0,"user":null},{"consignee":"许光宇","id":27,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"23423","state":0,"user":null},{"consignee":"443534","id":25,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"443534","state":0,"user":null}],"name":"xuxu22","password":"44445555","phone":"13445567825","power":1,"sex":"男","state":1,"totalOut":0,"vendor":null}
             */

            private VendorBean vendor;
            /**
             * count : 0
             * id : 49
             * name : 好了
             * state : 0
             * storeId : 20
             */

            private List<CategoriesBean> categories;
            private List<?> storePrivileges;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getClickCount() {
                return clickCount;
            }

            public void setClickCount(int clickCount) {
                this.clickCount = clickCount;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getDetails() {
                return details;
            }

            public void setDetails(String details) {
                this.details = details;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public IdcardBean getIdcard() {
                return idcard;
            }

            public void setIdcard(IdcardBean idcard) {
                this.idcard = idcard;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPackingFee() {
                return packingFee;
            }

            public void setPackingFee(int packingFee) {
                this.packingFee = packingFee;
            }

            public Object getPosition() {
                return position;
            }

            public void setPosition(Object position) {
                this.position = position;
            }

            public int getSellCount() {
                return sellCount;
            }

            public void setSellCount(int sellCount) {
                this.sellCount = sellCount;
            }

            public int getStartFee() {
                return startFee;
            }

            public void setStartFee(int startFee) {
                this.startFee = startFee;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public StoreImageBean getStoreImage() {
                return storeImage;
            }

            public void setStoreImage(StoreImageBean storeImage) {
                this.storeImage = storeImage;
            }

            public VendorBean getVendor() {
                return vendor;
            }

            public void setVendor(VendorBean vendor) {
                this.vendor = vendor;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public List<?> getStorePrivileges() {
                return storePrivileges;
            }

            public void setStorePrivileges(List<?> storePrivileges) {
                this.storePrivileges = storePrivileges;
            }

            public static class IdcardBean {
                private String address;
                private int id;
                private String name;
                private String number;
                /**
                 * id : 13
                 * idcardId : 30
                 * shopFile : {"id":99,"url":"/save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg"}
                 * sign : null
                 */

                private List<IdcardImagesBean> idcardImages;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }

                public List<IdcardImagesBean> getIdcardImages() {
                    return idcardImages;
                }

                public void setIdcardImages(List<IdcardImagesBean> idcardImages) {
                    this.idcardImages = idcardImages;
                }

                public static class IdcardImagesBean {
                    private int id;
                    private int idcardId;
                    /**
                     * id : 99
                     * url : /save/1009/77cf9dff-27cd-4885-8399-6a185c5af8d2.jpg
                     */

                    private ShopFileBean shopFile;
                    private Object sign;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getIdcardId() {
                        return idcardId;
                    }

                    public void setIdcardId(int idcardId) {
                        this.idcardId = idcardId;
                    }

                    public ShopFileBean getShopFile() {
                        return shopFile;
                    }

                    public void setShopFile(ShopFileBean shopFile) {
                        this.shopFile = shopFile;
                    }

                    public Object getSign() {
                        return sign;
                    }

                    public void setSign(Object sign) {
                        this.sign = sign;
                    }

                    public static class ShopFileBean {
                        private int id;
                        private String url;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }
            }

            public static class StoreImageBean {
                private int id;
                /**
                 * id : 117
                 * url : /save/10/683f4d25-932b-4549-8dd5-7a858c458401.JPG
                 */

                private ShopFileBean shopFile;
                private Object store;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public ShopFileBean getShopFile() {
                    return shopFile;
                }

                public void setShopFile(ShopFileBean shopFile) {
                    this.shopFile = shopFile;
                }

                public Object getStore() {
                    return store;
                }

                public void setStore(Object store) {
                    this.store = store;
                }

                public static class ShopFileBean {
                    private int id;
                    private String url;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }

            public static class VendorBean {
                private int id;
                private int state;
                private Object store;
                /**
                 * email : 34564747@qq.com
                 * id : 1009
                 * myAddresses : [{"consignee":"许光宇","id":26,"path":" 地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"123423","state":0,"user":null},{"consignee":"许光宇","id":27,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"23423","state":0,"user":null},{"consignee":"443534","id":25,"path":"广东省从化市太平镇广从大道13号","phone":"13640869683","postalcode":"443534","state":0,"user":null}]
                 * name : xuxu22
                 * password : 44445555
                 * phone : 13445567825
                 * power : 1
                 * sex : 男
                 * state : 1
                 * totalOut : 0
                 * vendor : null
                 */

                private UserBean user;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getState() {
                    return state;
                }

                public void setState(int state) {
                    this.state = state;
                }

                public Object getStore() {
                    return store;
                }

                public void setStore(Object store) {
                    this.store = store;
                }

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public static class UserBean {
                    private String email;
                    private int id;
                    private String name;
                    private String password;
                    private String phone;
                    private int power;
                    private String sex;
                    private int state;
                    private int totalOut;
                    private Object vendor;
                    /**
                     * consignee : 许光宇
                     * id : 26
                     * path :  地址 * 邮政编码 * 添加收货地址 收货地址列表 443534 443534 13640869683 广东省从化市太平镇广从大道13号
                     * phone : 13640869683
                     * postalcode : 123423
                     * state : 0
                     * user : null
                     */

                    private List<MyAddressesBean> myAddresses;

                    public String getEmail() {
                        return email;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getPassword() {
                        return password;
                    }

                    public void setPassword(String password) {
                        this.password = password;
                    }

                    public String getPhone() {
                        return phone;
                    }

                    public void setPhone(String phone) {
                        this.phone = phone;
                    }

                    public int getPower() {
                        return power;
                    }

                    public void setPower(int power) {
                        this.power = power;
                    }

                    public String getSex() {
                        return sex;
                    }

                    public void setSex(String sex) {
                        this.sex = sex;
                    }

                    public int getState() {
                        return state;
                    }

                    public void setState(int state) {
                        this.state = state;
                    }

                    public int getTotalOut() {
                        return totalOut;
                    }

                    public void setTotalOut(int totalOut) {
                        this.totalOut = totalOut;
                    }

                    public Object getVendor() {
                        return vendor;
                    }

                    public void setVendor(Object vendor) {
                        this.vendor = vendor;
                    }

                    public List<MyAddressesBean> getMyAddresses() {
                        return myAddresses;
                    }

                    public void setMyAddresses(List<MyAddressesBean> myAddresses) {
                        this.myAddresses = myAddresses;
                    }

                    public static class MyAddressesBean {
                        private String consignee;
                        private int id;
                        private String path;
                        private String phone;
                        private String postalcode;
                        private int state;
                        private Object user;

                        public String getConsignee() {
                            return consignee;
                        }

                        public void setConsignee(String consignee) {
                            this.consignee = consignee;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }

                        public String getPhone() {
                            return phone;
                        }

                        public void setPhone(String phone) {
                            this.phone = phone;
                        }

                        public String getPostalcode() {
                            return postalcode;
                        }

                        public void setPostalcode(String postalcode) {
                            this.postalcode = postalcode;
                        }

                        public int getState() {
                            return state;
                        }

                        public void setState(int state) {
                            this.state = state;
                        }

                        public Object getUser() {
                            return user;
                        }

                        public void setUser(Object user) {
                            this.user = user;
                        }
                    }
                }
            }

            public static class CategoriesBean {
                private int count;
                private int id;
                private String name;
                private int state;
                private int storeId;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getState() {
                    return state;
                }

                public void setState(int state) {
                    this.state = state;
                }

                public int getStoreId() {
                    return storeId;
                }

                public void setStoreId(int storeId) {
                    this.storeId = storeId;
                }
            }
        }

        public static class UserBean {
            private String email;
            private int id;
            private String name;
            private String password;
            private String phone;
            private int power;
            private String sex;
            private int state;
            private int totalOut;
            private Object vendor;
            private List<?> myAddresses;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getPower() {
                return power;
            }

            public void setPower(int power) {
                this.power = power;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getTotalOut() {
                return totalOut;
            }

            public void setTotalOut(int totalOut) {
                this.totalOut = totalOut;
            }

            public Object getVendor() {
                return vendor;
            }

            public void setVendor(Object vendor) {
                this.vendor = vendor;
            }

            public List<?> getMyAddresses() {
                return myAddresses;
            }

            public void setMyAddresses(List<?> myAddresses) {
                this.myAddresses = myAddresses;
            }
        }
    }
}
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.openim.common.im.bean;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-27")
public class ThriftDeviceMsg implements org.apache.thrift.TBase<ThriftDeviceMsg, ThriftDeviceMsg._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDeviceMsg> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDeviceMsg");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TO_FIELD_DESC = new org.apache.thrift.protocol.TField("to", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FROM_FIELD_DESC = new org.apache.thrift.protocol.TField("from", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LOGIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("loginId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("pwd", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SERVER_QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("serverQueue", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftDeviceMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftDeviceMsgTupleSchemeFactory());
  }

  public int type; // required
  public String to; // optional
  public String msg; // optional
  public String from; // optional
  public String loginId; // optional
  public String pwd; // optional
  public String serverQueue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    TO((short)2, "to"),
    MSG((short)3, "msg"),
    FROM((short)4, "from"),
    LOGIN_ID((short)5, "loginId"),
    PWD((short)6, "pwd"),
    SERVER_QUEUE((short)7, "serverQueue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // TO
          return TO;
        case 3: // MSG
          return MSG;
        case 4: // FROM
          return FROM;
        case 5: // LOGIN_ID
          return LOGIN_ID;
        case 6: // PWD
          return PWD;
        case 7: // SERVER_QUEUE
          return SERVER_QUEUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TO,_Fields.MSG,_Fields.FROM,_Fields.LOGIN_ID,_Fields.PWD,_Fields.SERVER_QUEUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TO, new org.apache.thrift.meta_data.FieldMetaData("to", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FROM, new org.apache.thrift.meta_data.FieldMetaData("from", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOGIN_ID, new org.apache.thrift.meta_data.FieldMetaData("loginId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PWD, new org.apache.thrift.meta_data.FieldMetaData("pwd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_QUEUE, new org.apache.thrift.meta_data.FieldMetaData("serverQueue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDeviceMsg.class, metaDataMap);
  }

  public ThriftDeviceMsg() {
  }

  public ThriftDeviceMsg(
    int type)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDeviceMsg(ThriftDeviceMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    if (other.isSetTo()) {
      this.to = other.to;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetFrom()) {
      this.from = other.from;
    }
    if (other.isSetLoginId()) {
      this.loginId = other.loginId;
    }
    if (other.isSetPwd()) {
      this.pwd = other.pwd;
    }
    if (other.isSetServerQueue()) {
      this.serverQueue = other.serverQueue;
    }
  }

  public ThriftDeviceMsg deepCopy() {
    return new ThriftDeviceMsg(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    this.to = null;
    this.msg = null;
    this.from = null;
    this.loginId = null;
    this.pwd = null;
    this.serverQueue = null;
  }

  public int getType() {
    return this.type;
  }

  public ThriftDeviceMsg setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public String getTo() {
    return this.to;
  }

  public ThriftDeviceMsg setTo(String to) {
    this.to = to;
    return this;
  }

  public void unsetTo() {
    this.to = null;
  }

  /** Returns true if field to is set (has been assigned a value) and false otherwise */
  public boolean isSetTo() {
    return this.to != null;
  }

  public void setToIsSet(boolean value) {
    if (!value) {
      this.to = null;
    }
  }

  public String getMsg() {
    return this.msg;
  }

  public ThriftDeviceMsg setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public String getFrom() {
    return this.from;
  }

  public ThriftDeviceMsg setFrom(String from) {
    this.from = from;
    return this;
  }

  public void unsetFrom() {
    this.from = null;
  }

  /** Returns true if field from is set (has been assigned a value) and false otherwise */
  public boolean isSetFrom() {
    return this.from != null;
  }

  public void setFromIsSet(boolean value) {
    if (!value) {
      this.from = null;
    }
  }

  public String getLoginId() {
    return this.loginId;
  }

  public ThriftDeviceMsg setLoginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  public void unsetLoginId() {
    this.loginId = null;
  }

  /** Returns true if field loginId is set (has been assigned a value) and false otherwise */
  public boolean isSetLoginId() {
    return this.loginId != null;
  }

  public void setLoginIdIsSet(boolean value) {
    if (!value) {
      this.loginId = null;
    }
  }

  public String getPwd() {
    return this.pwd;
  }

  public ThriftDeviceMsg setPwd(String pwd) {
    this.pwd = pwd;
    return this;
  }

  public void unsetPwd() {
    this.pwd = null;
  }

  /** Returns true if field pwd is set (has been assigned a value) and false otherwise */
  public boolean isSetPwd() {
    return this.pwd != null;
  }

  public void setPwdIsSet(boolean value) {
    if (!value) {
      this.pwd = null;
    }
  }

  public String getServerQueue() {
    return this.serverQueue;
  }

  public ThriftDeviceMsg setServerQueue(String serverQueue) {
    this.serverQueue = serverQueue;
    return this;
  }

  public void unsetServerQueue() {
    this.serverQueue = null;
  }

  /** Returns true if field serverQueue is set (has been assigned a value) and false otherwise */
  public boolean isSetServerQueue() {
    return this.serverQueue != null;
  }

  public void setServerQueueIsSet(boolean value) {
    if (!value) {
      this.serverQueue = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case TO:
      if (value == null) {
        unsetTo();
      } else {
        setTo((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case FROM:
      if (value == null) {
        unsetFrom();
      } else {
        setFrom((String)value);
      }
      break;

    case LOGIN_ID:
      if (value == null) {
        unsetLoginId();
      } else {
        setLoginId((String)value);
      }
      break;

    case PWD:
      if (value == null) {
        unsetPwd();
      } else {
        setPwd((String)value);
      }
      break;

    case SERVER_QUEUE:
      if (value == null) {
        unsetServerQueue();
      } else {
        setServerQueue((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return Integer.valueOf(getType());

    case TO:
      return getTo();

    case MSG:
      return getMsg();

    case FROM:
      return getFrom();

    case LOGIN_ID:
      return getLoginId();

    case PWD:
      return getPwd();

    case SERVER_QUEUE:
      return getServerQueue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case TO:
      return isSetTo();
    case MSG:
      return isSetMsg();
    case FROM:
      return isSetFrom();
    case LOGIN_ID:
      return isSetLoginId();
    case PWD:
      return isSetPwd();
    case SERVER_QUEUE:
      return isSetServerQueue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDeviceMsg)
      return this.equals((ThriftDeviceMsg)that);
    return false;
  }

  public boolean equals(ThriftDeviceMsg that) {
    if (that == null)
      return false;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_to = true && this.isSetTo();
    boolean that_present_to = true && that.isSetTo();
    if (this_present_to || that_present_to) {
      if (!(this_present_to && that_present_to))
        return false;
      if (!this.to.equals(that.to))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_from = true && this.isSetFrom();
    boolean that_present_from = true && that.isSetFrom();
    if (this_present_from || that_present_from) {
      if (!(this_present_from && that_present_from))
        return false;
      if (!this.from.equals(that.from))
        return false;
    }

    boolean this_present_loginId = true && this.isSetLoginId();
    boolean that_present_loginId = true && that.isSetLoginId();
    if (this_present_loginId || that_present_loginId) {
      if (!(this_present_loginId && that_present_loginId))
        return false;
      if (!this.loginId.equals(that.loginId))
        return false;
    }

    boolean this_present_pwd = true && this.isSetPwd();
    boolean that_present_pwd = true && that.isSetPwd();
    if (this_present_pwd || that_present_pwd) {
      if (!(this_present_pwd && that_present_pwd))
        return false;
      if (!this.pwd.equals(that.pwd))
        return false;
    }

    boolean this_present_serverQueue = true && this.isSetServerQueue();
    boolean that_present_serverQueue = true && that.isSetServerQueue();
    if (this_present_serverQueue || that_present_serverQueue) {
      if (!(this_present_serverQueue && that_present_serverQueue))
        return false;
      if (!this.serverQueue.equals(that.serverQueue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true;
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_to = true && (isSetTo());
    list.add(present_to);
    if (present_to)
      list.add(to);

    boolean present_msg = true && (isSetMsg());
    list.add(present_msg);
    if (present_msg)
      list.add(msg);

    boolean present_from = true && (isSetFrom());
    list.add(present_from);
    if (present_from)
      list.add(from);

    boolean present_loginId = true && (isSetLoginId());
    list.add(present_loginId);
    if (present_loginId)
      list.add(loginId);

    boolean present_pwd = true && (isSetPwd());
    list.add(present_pwd);
    if (present_pwd)
      list.add(pwd);

    boolean present_serverQueue = true && (isSetServerQueue());
    list.add(present_serverQueue);
    if (present_serverQueue)
      list.add(serverQueue);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftDeviceMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTo()).compareTo(other.isSetTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.to, other.to);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(other.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFrom()).compareTo(other.isSetFrom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.from, other.from);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoginId()).compareTo(other.isSetLoginId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoginId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loginId, other.loginId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPwd()).compareTo(other.isSetPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pwd, other.pwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerQueue()).compareTo(other.isSetServerQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerQueue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverQueue, other.serverQueue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftDeviceMsg(");
    boolean first = true;

    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (isSetTo()) {
      if (!first) sb.append(", ");
      sb.append("to:");
      if (this.to == null) {
        sb.append("null");
      } else {
        sb.append(this.to);
      }
      first = false;
    }
    if (isSetMsg()) {
      if (!first) sb.append(", ");
      sb.append("msg:");
      if (this.msg == null) {
        sb.append("null");
      } else {
        sb.append(this.msg);
      }
      first = false;
    }
    if (isSetFrom()) {
      if (!first) sb.append(", ");
      sb.append("from:");
      if (this.from == null) {
        sb.append("null");
      } else {
        sb.append(this.from);
      }
      first = false;
    }
    if (isSetLoginId()) {
      if (!first) sb.append(", ");
      sb.append("loginId:");
      if (this.loginId == null) {
        sb.append("null");
      } else {
        sb.append(this.loginId);
      }
      first = false;
    }
    if (isSetPwd()) {
      if (!first) sb.append(", ");
      sb.append("pwd:");
      if (this.pwd == null) {
        sb.append("null");
      } else {
        sb.append(this.pwd);
      }
      first = false;
    }
    if (isSetServerQueue()) {
      if (!first) sb.append(", ");
      sb.append("serverQueue:");
      if (this.serverQueue == null) {
        sb.append("null");
      } else {
        sb.append(this.serverQueue);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'type' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftDeviceMsgStandardSchemeFactory implements SchemeFactory {
    public ThriftDeviceMsgStandardScheme getScheme() {
      return new ThriftDeviceMsgStandardScheme();
    }
  }

  private static class ThriftDeviceMsgStandardScheme extends StandardScheme<ThriftDeviceMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDeviceMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.to = iprot.readString();
              struct.setToIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FROM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.from = iprot.readString();
              struct.setFromIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LOGIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.loginId = iprot.readString();
              struct.setLoginIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pwd = iprot.readString();
              struct.setPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SERVER_QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverQueue = iprot.readString();
              struct.setServerQueueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDeviceMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      if (struct.to != null) {
        if (struct.isSetTo()) {
          oprot.writeFieldBegin(TO_FIELD_DESC);
          oprot.writeString(struct.to);
          oprot.writeFieldEnd();
        }
      }
      if (struct.msg != null) {
        if (struct.isSetMsg()) {
          oprot.writeFieldBegin(MSG_FIELD_DESC);
          oprot.writeString(struct.msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.from != null) {
        if (struct.isSetFrom()) {
          oprot.writeFieldBegin(FROM_FIELD_DESC);
          oprot.writeString(struct.from);
          oprot.writeFieldEnd();
        }
      }
      if (struct.loginId != null) {
        if (struct.isSetLoginId()) {
          oprot.writeFieldBegin(LOGIN_ID_FIELD_DESC);
          oprot.writeString(struct.loginId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.pwd != null) {
        if (struct.isSetPwd()) {
          oprot.writeFieldBegin(PWD_FIELD_DESC);
          oprot.writeString(struct.pwd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serverQueue != null) {
        if (struct.isSetServerQueue()) {
          oprot.writeFieldBegin(SERVER_QUEUE_FIELD_DESC);
          oprot.writeString(struct.serverQueue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftDeviceMsgTupleSchemeFactory implements SchemeFactory {
    public ThriftDeviceMsgTupleScheme getScheme() {
      return new ThriftDeviceMsgTupleScheme();
    }
  }

  private static class ThriftDeviceMsgTupleScheme extends TupleScheme<ThriftDeviceMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDeviceMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type);
      BitSet optionals = new BitSet();
      if (struct.isSetTo()) {
        optionals.set(0);
      }
      if (struct.isSetMsg()) {
        optionals.set(1);
      }
      if (struct.isSetFrom()) {
        optionals.set(2);
      }
      if (struct.isSetLoginId()) {
        optionals.set(3);
      }
      if (struct.isSetPwd()) {
        optionals.set(4);
      }
      if (struct.isSetServerQueue()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTo()) {
        oprot.writeString(struct.to);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetFrom()) {
        oprot.writeString(struct.from);
      }
      if (struct.isSetLoginId()) {
        oprot.writeString(struct.loginId);
      }
      if (struct.isSetPwd()) {
        oprot.writeString(struct.pwd);
      }
      if (struct.isSetServerQueue()) {
        oprot.writeString(struct.serverQueue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDeviceMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = iprot.readI32();
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.to = iprot.readString();
        struct.setToIsSet(true);
      }
      if (incoming.get(1)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.from = iprot.readString();
        struct.setFromIsSet(true);
      }
      if (incoming.get(3)) {
        struct.loginId = iprot.readString();
        struct.setLoginIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.pwd = iprot.readString();
        struct.setPwdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.serverQueue = iprot.readString();
        struct.setServerQueueIsSet(true);
      }
    }
  }

}


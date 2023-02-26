package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = Address.class)
public class Address {
    @JsonProperty("Ref")
    public String ref;
    @JsonProperty("SettlementType")
    public String settlementType;
    @JsonProperty("Latitude")
    public String latitude;
    @JsonProperty("Longitude")
    public String longitude;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("DescriptionRu")
    public String descriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String descriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String settlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String settlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String settlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String region;
    @JsonProperty("RegionsDescription")
    public String regionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String regionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String regionsDescriptionTranslit;
    @JsonProperty("Area")
    public String area;
    @JsonProperty("AreaDescription")
    public String areaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String areaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String areaDescriptionTranslit;
    @JsonProperty("Index1")
    public String index1;
    @JsonProperty("Index2")
    public String index2;
    @JsonProperty("IndexCOATSU1")
    public String indexCOATSU1;
    @JsonProperty("Delivery1")
    public String delivery1;
    @JsonProperty("Delivery2")
    public String delivery2;
    @JsonProperty("Delivery3")
    public String delivery3;
    @JsonProperty("Delivery4")
    public String delivery4;
    @JsonProperty("Delivery5")
    public String delivery5;
    @JsonProperty("Delivery6")
    public String delivery6;
    @JsonProperty("Delivery7")
    public String delivery7;
    @JsonProperty("SpecialCashCheck")
    public int specialCashCheck;
    @JsonProperty("Warehouse")
    public String warehouse;

    @JsonCreator
    public Address(@JsonProperty("Ref") String ref, @JsonProperty("SettlementType") String settlementType, @JsonProperty("Latitude") String latitude, @JsonProperty("Longitude") String longitude, @JsonProperty("Description") String description, @JsonProperty("DescriptionRu") String descriptionRu,
                   @JsonProperty("DescriptionTranslit") String descriptionTranslit, @JsonProperty("SettlementTypeDescription") String settlementTypeDescription, @JsonProperty("SettlementTypeDescriptionRu") String settlementTypeDescriptionRu,
                   @JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionTranslit, @JsonProperty("Region") String region, @JsonProperty("RegionsDescription") String regionsDescription, @JsonProperty("RegionsDescriptionRu") String regionsDescriptionRu,
                   @JsonProperty("RegionsDescriptionTranslit") String regionsDescriptionTranslit,    @JsonProperty("Area") String area, @JsonProperty("AreaDescription") String areaDescription, @JsonProperty("AreaDescriptionRu") String areaDescriptionRu, @JsonProperty("AreaDescriptionTranslit") String areaDescriptionTranslit,
                   @JsonProperty("Index1") String index1, @JsonProperty("Index2") String index2, @JsonProperty("IndexCOATSU1") String indexCOATSU1, @JsonProperty("Delivery1") String delivery1, @JsonProperty("Delivery2") String delivery2, @JsonProperty("Delivery3") String delivery3,
                   @JsonProperty("Delivery4") String delivery4, @JsonProperty("Delivery5") String delivery5, @JsonProperty("Delivery6") String delivery6, @JsonProperty("Delivery7") String delivery7, @JsonProperty("SpecialCashCheck") int specialCashCheck, @JsonProperty("Warehouse")  String warehouse) {
        this.ref = ref;
        this.settlementType = settlementType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.descriptionRu = descriptionRu;
        this.descriptionTranslit = descriptionTranslit;
        this.settlementTypeDescription = settlementTypeDescription;
        this.settlementTypeDescriptionRu = settlementTypeDescriptionRu;
        this.settlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
        this.region = region;
        this.regionsDescription = regionsDescription;
        this.regionsDescriptionRu = regionsDescriptionRu;
        this.regionsDescriptionTranslit = regionsDescriptionTranslit;
        this.area = area;
        this.areaDescription = areaDescription;
        this.areaDescriptionRu = areaDescriptionRu;
        this.areaDescriptionTranslit = areaDescriptionTranslit;
        this.index1 = index1;
        this.index2 = index2;
        this.indexCOATSU1 = indexCOATSU1;
        this.delivery1 = delivery1;
        this.delivery2 = delivery2;
        this.delivery3 = delivery3;
        this.delivery4 = delivery4;
        this.delivery5 = delivery5;
        this.delivery6 = delivery6;
        this.delivery7 = delivery7;
        this.specialCashCheck = specialCashCheck;
        this.warehouse = warehouse;
    }
    @Getter
    public String getRef() { return ref; }
    @Getter
    public String getSettlementType() { return settlementType; }
    @Getter
    public String getLatitude() { return latitude; }
    @Getter
    public String getLongitude() { return longitude; }
    @Getter
    public String getDescription() { return description; }
    @Getter
    public String getDescriptionRu() { return descriptionRu; }
    @Getter
    public String getDescriptionTranslit() { return descriptionTranslit; }
    @Getter
    public String getSettlementTypeDescription() { return settlementTypeDescription; }
    @Getter
    public String getSettlementTypeDescriptionRu() { return settlementTypeDescriptionRu;}
    @Getter
    public String getSettlementTypeDescriptionTranslit() { return settlementTypeDescriptionTranslit;}
    @Getter
    public String getRegion() { return region; }
    @Getter
    public String getRegionsDescription() { return regionsDescription; }
    @Getter
    public String getRegionsDescriptionRu() { return regionsDescriptionRu; }
    @Getter
    public String getRegionsDescriptionTranslit() { return regionsDescriptionTranslit; }
    @Getter
    public String getArea() { return area; }
    @Getter
    public String getAreaDescription() { return areaDescription; }
    @Getter
    public String getAreaDescriptionRu() { return areaDescriptionRu; }
    @Getter
    public String getAreaDescriptionTranslit() { return areaDescriptionTranslit; }
    @Getter
    public String getIndex1() { return index1; }
    @Getter
    public String getIndex2() { return index2; }
    @Getter
    public String getIndexCOATSU1() { return indexCOATSU1; }
    @Getter
    public String getDelivery1() { return delivery1; }
    @Getter
    public String getDelivery2() { return delivery2; }
    @Getter
    public String getDelivery3() { return delivery3; }
    @Getter
    public String getDelivery4() { return delivery4; }
    @Getter
    public String getDelivery5() { return delivery5; }
    @Getter
    public String getDelivery6() { return delivery6; }
    @Getter
    public String getDelivery7() { return delivery7; }
    @Getter
    public int getSpecialCashCheck() { return specialCashCheck; }
    @Getter
    public String getWarehouse() { return warehouse; }

    @Setter
    public void setRef(String ref) { this.ref = ref; }
    @Setter
    public void setSettlementType(String settlementType) { this.settlementType = settlementType; }
    @Setter
    public void setLatitude(String latitude) { this.latitude = latitude; }
    @Setter
    public void setLongitude(String longitude) { this.longitude = longitude; }
    @Setter
    public void setDescription(String description) { this.description = description; }
    @Setter
    public void setDescriptionRu(String descriptionRu) { this.descriptionRu = descriptionRu; }
    @Setter
    public void setDescriptionTranslit(String descriptionTranslit) { this.descriptionTranslit = descriptionTranslit; }
    @Setter
    public void setSettlementTypeDescription(String settlementTypeDescription) { this.settlementTypeDescription = settlementTypeDescription; }
    @Setter
    public void setSettlementTypeDescriptionRu(String settlementTypeDescriptionRu) { this.settlementTypeDescriptionRu = settlementTypeDescriptionRu; }
    @Setter
    public void setSettlementTypeDescriptionTranslit(String settlementTypeDescriptionTranslit) { this.settlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit; }
    @Setter
    public void setRegion(String region) { this.region = region; }
    @Setter
    public void setRegionsDescription(String regionsDescription) { this.regionsDescription = regionsDescription; }
    @Setter
    public void setRegionsDescriptionRu(String regionsDescriptionRu) { this.regionsDescriptionRu = regionsDescriptionRu; }
    @Setter
    public void setRegionsDescriptionTranslit(String regionsDescriptionTranslit) { this.regionsDescriptionTranslit = regionsDescriptionTranslit; }
    @Setter
    public void setArea(String area) { this.area = area; }
    @Setter
    public void setAreaDescription(String areaDescription) { this.areaDescription = areaDescription; }
    @Setter
    public void setAreaDescriptionRu(String areaDescriptionRu) { this.areaDescriptionRu = areaDescriptionRu; }
    @Setter
    public void setAreaDescriptionTranslit(String areaDescriptionTranslit) { this.areaDescriptionTranslit = areaDescriptionTranslit; }
    @Setter
    public void setIndex1(String index1) { this.index1 = index1; }
    @Setter
    public void setIndex2(String index2) { this.index2 = index2; }
    @Setter
    public void setIndexCOATSU1(String indexCOATSU1) { this.indexCOATSU1 = indexCOATSU1; }
    @Setter
    public void setDelivery1(String delivery1) { this.delivery1 = delivery1; }
    @Setter
    public void setDelivery2(String delivery2) { this.delivery2 = delivery2; }
    @Setter
    public void setDelivery3(String delivery3) { this.delivery3 = delivery3; }
    @Setter
    public void setDelivery4(String delivery4) { this.delivery4 = delivery4; }
    @Setter
    public void setDelivery5(String delivery5) { this.delivery5 = delivery5; }
    @Setter
    public void setDelivery6(String delivery6) { this.delivery6 = delivery6; }
    @Setter
    public void setDelivery7(String delivery7) { this.delivery7 = delivery7; }
    @Setter
    public void setSpecialCashCheck(int specialCashCheck) { this.specialCashCheck = specialCashCheck; }
    @Setter
    public void setWarehouse(String warehouse) { this.warehouse = warehouse; }

    @Override
    public String toString() {
        return "Address{" +
                "ref='" + ref + '\'' +
                ", settlementType='" + settlementType + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", description='" + description + '\'' +
                ", descriptionRu='" + descriptionRu + '\'' +
                ", descriptionTranslit='" + descriptionTranslit + '\'' +
                ", settlementTypeDescription='" + settlementTypeDescription + '\'' +
                ", settlementTypeDescriptionRu='" + settlementTypeDescriptionRu + '\'' +
                ", settlementTypeDescriptionTranslit='" + settlementTypeDescriptionTranslit + '\'' +
                ", region='" + region + '\'' +
                ", regionsDescription='" + regionsDescription + '\'' +
                ", regionsDescriptionRu='" + regionsDescriptionRu + '\'' +
                ", regionsDescriptionTranslit='" + regionsDescriptionTranslit + '\'' +
                ", area='" + area + '\'' +
                ", areaDescription='" + areaDescription + '\'' +
                ", areaDescriptionRu='" + areaDescriptionRu + '\'' +
                ", areaDescriptionTranslit='" + areaDescriptionTranslit + '\'' +
                ", index1='" + index1 + '\'' +
                ", index2='" + index2 + '\'' +
                ", indexCOATSU1='" + indexCOATSU1 + '\'' +
                ", delivery1='" + delivery1 + '\'' +
                ", delivery2='" + delivery2 + '\'' +
                ", delivery3='" + delivery3 + '\'' +
                ", delivery4='" + delivery4 + '\'' +
                ", delivery5='" + delivery5 + '\'' +
                ", delivery6='" + delivery6 + '\'' +
                ", delivery7='" + delivery7 + '\'' +
                ", specialCashCheck=" + specialCashCheck +
                ", warehouse='" + warehouse + '\'' +
                '}';
    }
}

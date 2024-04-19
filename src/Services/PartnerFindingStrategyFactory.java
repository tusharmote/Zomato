package Services;

public class PartnerFindingStrategyFactory {
    public static PartnerFindingStrategy getPartnerFindingStrategy(){
        return new LocBasedPartnerFindingStrategy();
    }
}

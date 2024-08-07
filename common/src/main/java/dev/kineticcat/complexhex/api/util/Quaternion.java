package dev.kineticcat.complexhex.api.util;

import at.petrak.hexcasting.api.casting.iota.Iota;
import dev.kineticcat.complexhex.api.casting.iota.QuaternionIota;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaterniond;

import java.util.List;

import static at.petrak.hexcasting.api.utils.HexUtils.fixNAN;

public class Quaternion extends Quaterniond {
    public Quaternion(double w, double x, double y, double z) {
        super(x, y, z, w);
    }

    public Quaternion() {
        super(0,0,0,0);
    }
    public Quaternion(Vec3 axis, double angle) {
        super(0,0,0,0);
        double C = Math.cos(angle/2);
        double S = Math.sin(angle/2);
        this.w = C;
        this.x = axis.x*S;
        this.y = axis.y*S;
        this.z = axis.z*S;
    }


    public QuaternionIota asIota() { return new QuaternionIota(this); }
    public List<Iota> asActionResult() { return List.of(new QuaternionIota(this)); }
    public Quaternion fixNaN() {
        return new Quaternion(fixNAN(this.w), fixNAN(this.x), fixNAN(this.y), fixNAN(this.z));
    }
    public Quaternion Qadd(Quaternion that) {return (Quaternion) super.add(that);}
    public Quaternion Qsub(Quaternion that) {return (Quaternion) super.difference(that);}
    public Quaternion Qmul(Double that) {return (Quaternion) super.mul(that);}
    public Quaternion Qmul(Quaternion that) {return (Quaternion) super.mul(that);}
    public Quaternion Qdiv(Double that) {return (Quaternion) super.mul(1/that);}
    public Quaternion Qinvert() {return (Quaternion) super.invert();}
}
